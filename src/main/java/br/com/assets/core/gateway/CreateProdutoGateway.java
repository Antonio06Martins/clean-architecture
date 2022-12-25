package br.com.assets.core.gateway;

import br.com.assets.core.domain.ProdutoDomain;

public interface CreateProdutoGateway {

    ProdutoDomain create(String id, ProdutoDomain produtoDomain);
}
