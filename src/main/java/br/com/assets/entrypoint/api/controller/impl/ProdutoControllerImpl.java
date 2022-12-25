package br.com.assets.entrypoint.api.controller.impl;

import br.com.assets.core.domain.ProdutoDomain;
import br.com.assets.entrypoint.api.controller.ProdutoController;
import br.com.assets.entrypoint.api.dto.output.ProdutoOutputDTO;
import br.com.assets.entrypoint.facade.ProdutoUpsertFacade;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ProdutoControllerImpl implements ProdutoController {

    private final ProdutoUpsertFacade produtoUpsertFacade;

    @Override
    public ProdutoOutputDTO upsert(String id, ProdutoDomain input) {
        return produtoUpsertFacade.upsert(id, input);
    }
}
