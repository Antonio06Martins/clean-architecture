package br.com.assets.dataprovider.database.gateway;

import br.com.assets.core.common.mapper.AssetsMapper;
import br.com.assets.core.domain.AssetsDomain;
import br.com.assets.core.gateway.CreateAssetsGateway;
import br.com.assets.dataprovider.database.repository.AssetsRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
@Slf4j
public class CreateAssetsGatewayImpl implements CreateAssetsGateway {

    private final AssetsRepository assetsRepository;

    private final AssetsMapper assetsMapper;
    @Override
    public AssetsDomain create(final String id, final String identifyId, final AssetsDomain assetsDomain, LocalDateTime now) {
        var assetsEntity = assetsMapper.toEntity(assetsDomain, identifyId, now);
        var assetsInDatabase = assetsRepository.save(assetsEntity);

        return assetsMapper.toDomain(assetsInDatabase);
    }
}
