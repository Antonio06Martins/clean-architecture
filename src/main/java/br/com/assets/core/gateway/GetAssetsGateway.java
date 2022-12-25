package br.com.assets.core.gateway;

import br.com.assets.core.domain.AssetsDomain;

public interface GetAssetsGateway {

    AssetsDomain findById(final String id);
}
