package br.com.assets.entrypoint.facade;

import br.com.assets.core.domain.AssetsDomain;
import br.com.assets.core.usecase.AssetsUpsertUseCase;
import br.com.assets.entrypoint.api.dto.output.AssetsOutputDTO;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
@Slf4j
public class AssetsUpsertFacade {

    private final AssetsUpsertUseCase assetsUpsertUseCase;

    public AssetsOutputDTO upsert(final String id, final String identifyId, AssetsDomain input) {
        log.info("Chamou Facade 1 [{}]", id);
        final var assetsDomain = upsertAssetsDomain(id, identifyId, input);
        return buildAssetsOutputDto(assetsDomain);
    }

    private AssetsDomain upsertAssetsDomain(final String id, final String identifyId, AssetsDomain input) {
        log.info("Chamou Facade 2 [{}]", id);
        return assetsUpsertUseCase.upsert(id, identifyId, input);
    }

    private AssetsOutputDTO buildAssetsOutputDto(final AssetsDomain input) {
        return AssetsOutputDTO.builder()
                .identifyId(input.getIdentifyId())
                .createdData(input.getCreatedData())
                .carDomain(AssetsOutputDTO.CarDomain.builder()
                        .model(input.getCarDomain().getModel())
                        .plate(input.getCarDomain().getPlate())
                        .value(input.getCarDomain().getValue())
                        .build())
                .build();
    }
}
