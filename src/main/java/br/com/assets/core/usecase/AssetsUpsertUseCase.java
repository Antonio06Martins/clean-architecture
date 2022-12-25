package br.com.assets.core.usecase;

import br.com.assets.core.domain.AssetsDomain;
import br.com.assets.core.exception.NotFoundException;
import br.com.assets.core.gateway.CreateAssetsGateway;
import br.com.assets.core.gateway.GetAssetsGateway;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.Objects;

import static java.util.Objects.isNull;

@Slf4j
@Component
@RequiredArgsConstructor
public class AssetsUpsertUseCase {

    private final GetAssetsGateway getAssetsGateway;

    private final CreateAssetsGateway createAssetsGateway;

    public AssetsDomain upsert(final String id, final String identifyId, AssetsDomain input) {

        log.info("chamou UseCase 1 [{}]", id);
        log.info("chamou UseCase 1 [{}]", input.getCarDomain().getModel());
        final var assetsInDatabase = searchAssetsInDatabase(id);

        if(isNull(assetsInDatabase)) {
            final var assetsDomain = createAssetsGateway.create(id, identifyId, input, LocalDateTime.now());
            return saveAssets(id, identifyId, assetsDomain, LocalDateTime.now());
        }
        return updateAssets(id, identifyId, input);
    }

    private AssetsDomain updateAssets(final String id, final String identifyId, final AssetsDomain assetsDomainInDatabase) {

        final var assetsInDatabase = searchAssetsInDatabase(id);
        Objects.requireNonNull(assetsInDatabase).update(identifyId, assetsDomainInDatabase, LocalDateTime.now());
        return saveAssets(id, identifyId, assetsInDatabase, LocalDateTime.now());
    }

    private AssetsDomain saveAssets(final String id, final String identifyId, final AssetsDomain input, LocalDateTime now) {
        return createAssetsGateway.create(id, identifyId, input, now);
    }

    private AssetsDomain searchAssetsInDatabase(final String id) {
        try {
            return getAssetsGateway.findById(id);
        } catch (NotFoundException e) {
            return null;
        }
    }
}
