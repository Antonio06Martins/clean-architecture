package br.com.assets.core.common.mapper;

import br.com.assets.core.domain.AssetsDomain;
import br.com.assets.dataprovider.database.entity.AssetsEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.time.LocalDateTime;
import java.util.UUID;

@Mapper(componentModel = "spring", imports = UUID.class)
public interface AssetsMapper {

    AssetsMapper INSTANCE = Mappers.getMapper(AssetsMapper.class);

    AssetsDomain toDomain(final AssetsEntity entity);

    AssetsEntity toEntity(final AssetsDomain assetsDomain, String identifyId, LocalDateTime now);


}
