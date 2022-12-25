package br.com.assets.core.common.mapper;

import br.com.assets.core.domain.ProdutoDomain;
import br.com.assets.dataprovider.database.entity.ProdutoEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.UUID;

@Mapper(componentModel = "spring", imports = UUID.class)
public interface ProdutoMapper {

    ProdutoMapper INSTANCE = Mappers.getMapper(ProdutoMapper.class);

    ProdutoDomain toDomain(final ProdutoEntity produtoEntity);

    ProdutoEntity toEntity(ProdutoDomain produtoDomain);
}
