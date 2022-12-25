package br.com.assets.core.gateway;

import br.com.assets.core.domain.AssetsDomain;

import java.time.LocalDateTime;

public interface CreateAssetsGateway {

    AssetsDomain create(String id, String identifyId, AssetsDomain assetsDomain, LocalDateTime now);
}
