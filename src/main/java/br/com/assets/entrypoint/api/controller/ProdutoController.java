package br.com.assets.entrypoint.api.controller;

import br.com.assets.core.domain.ProdutoDomain;
import br.com.assets.entrypoint.api.dto.output.ProdutoOutputDTO;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

public interface ProdutoController {

    @PutMapping("v1/produto/{id}")
    ProdutoOutputDTO upsert(
            @PathVariable("id") String id,
            @RequestBody ProdutoDomain input);
}

