package br.com.assets.entrypoint.api.controller;

import br.com.assets.core.domain.ProdutoDomain;
import br.com.assets.entrypoint.api.dto.output.ProdutoOutputDTO;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Tag(name = "Estudo Clean Architecture")
public interface ProdutoController {

    @Operation(summary = "Estudo Clean Architecture")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Dados salvos com sucesso")
    })
    @PutMapping("v1/produto/{id}")
    ProdutoOutputDTO upsert(
            @PathVariable("id") String id,
            @RequestBody ProdutoDomain input);
}

