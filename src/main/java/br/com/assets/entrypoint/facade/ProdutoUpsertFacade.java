package br.com.assets.entrypoint.facade;

import br.com.assets.core.domain.ProdutoDomain;
import br.com.assets.core.usecase.ProdutoUpsertUseCase;
import br.com.assets.entrypoint.api.dto.output.ProdutoOutputDTO;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
@Slf4j
public class ProdutoUpsertFacade {

    private final ProdutoUpsertUseCase produtoUpsertUseCase;

    public ProdutoOutputDTO upsert(final String id, ProdutoDomain produtoDomain) {
        log.info("Chamou Facade 1 [{}]", id);
        final var produtoUpsertDomain = upsertProdutoDomain(id, produtoDomain);
        return buildProdutoOutputDto(produtoUpsertDomain);
    }

    private ProdutoDomain upsertProdutoDomain(final String id, ProdutoDomain produtoDomain) {
        log.info("Chamou Facade 2 [{}]", id);
        return produtoUpsertUseCase.upsert(id, produtoDomain);
    }

    private ProdutoOutputDTO buildProdutoOutputDto(final ProdutoDomain produtoDomain) {
        return ProdutoOutputDTO.builder()
                .nome(produtoDomain.getNome())
                .idadeDomain(ProdutoOutputDTO.IdadeDomain.builder()
                        .idade(produtoDomain.getIdadeDomain().getIdade())
                        .build())
                .build();
    }
}
