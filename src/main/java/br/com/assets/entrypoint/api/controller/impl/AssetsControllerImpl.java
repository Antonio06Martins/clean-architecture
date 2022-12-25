package br.com.assets.entrypoint.api.controller.impl;

import br.com.assets.core.domain.AssetsDomain;
import br.com.assets.entrypoint.api.controller.AssetsController;
import br.com.assets.entrypoint.api.dto.output.AssetsOutputDTO;
import br.com.assets.entrypoint.facade.AssetsUpsertFacade;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class AssetsControllerImpl implements AssetsController {

    private final AssetsUpsertFacade assetsUpsertFacade;

    @Override
    public AssetsOutputDTO upsert(String id, String identifyId, AssetsDomain input) {
        return assetsUpsertFacade.upsert(id, identifyId, input);
    }
}
