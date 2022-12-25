package br.com.assets.dataprovider.database.gateway;

import br.com.assets.core.common.mapper.ProdutoMapper;
import br.com.assets.core.domain.ProdutoDomain;
import br.com.assets.core.gateway.CreateProdutoGateway;
import br.com.assets.dataprovider.database.repository.ProdutoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CreateProdutoGatewayImpl implements CreateProdutoGateway {

    private final ProdutoRepository produtoRepository;

    private final ProdutoMapper produtoMapper;

    @Override
    public ProdutoDomain create(final String id, final ProdutoDomain produtoDomain) {
        final var produtoEntity = produtoMapper.toEntity(produtoDomain);
        final var produtoInDatabase = produtoRepository.save(produtoEntity);
        final var produtoDomainInDatabase = produtoMapper.toDomain(produtoInDatabase);
        return produtoDomainInDatabase;
    }
}
