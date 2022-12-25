package br.com.assets.dataprovider.database.gateway;

import br.com.assets.core.common.mapper.AssetsMapper;
import br.com.assets.core.domain.AssetsDomain;
import br.com.assets.core.enumeration.ExceptionCode;
import br.com.assets.core.exception.NotFoundException;
import br.com.assets.core.gateway.GetAssetsGateway;
import br.com.assets.dataprovider.database.repository.AssetsRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class GetAssetsGatewayImpl implements GetAssetsGateway {

    private final AssetsRepository assetsRepository;

    private final AssetsMapper assetsMapper;
    @Override
    public AssetsDomain findById(String id) {

        final var assetsEntity = assetsRepository.findById(id).orElseThrow(() -> getNotFoundException(id));

        return assetsMapper.toDomain(assetsEntity);
    }

    private NotFoundException getNotFoundException(final String id) {
        return new NotFoundException(ExceptionCode.ASSETS_NOT_FOUND.name(),
                ExceptionCode.ASSETS_NOT_FOUND.message);
    }
}
