package br.com.assets.core.gateway;

import br.com.assets.core.domain.ProdutoDomain;

public interface GetProdutoGateway {

    ProdutoDomain findById(final String id);
}
