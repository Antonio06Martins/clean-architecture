package br.com.assets.core.usecase;

import br.com.assets.core.domain.ProdutoDomain;
import br.com.assets.core.exception.NotFoundException;
import br.com.assets.core.gateway.CreateProdutoGateway;
import br.com.assets.core.gateway.GetProdutoGateway;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.Objects;

import static java.util.Objects.isNull;

@Slf4j
@Component
@RequiredArgsConstructor
public class ProdutoUpsertUseCase {

    private final GetProdutoGateway getProdutoGateway;

    private final CreateProdutoGateway createProdutoGateway;

    public ProdutoDomain upsert(final String id, final ProdutoDomain produtoDomain) {

        final var produtoInDatabase = searchProdutoInDatabase(id);
        log.info("chamou UseCase 1 [{}]", id);

        if(isNull(produtoInDatabase)) {
            final var produtoDomainCreate = createProdutoGateway.create(id, produtoDomain);
            return saveProduto(id, produtoDomainCreate);
        }
        return updateProduto(id, produtoDomain);

    }

    private ProdutoDomain updateProduto(final String id, final ProdutoDomain produtoDomainInDatabase) {
        final var produtoInDatabase = searchProdutoInDatabase(id);
        Objects.requireNonNull(produtoInDatabase).update(produtoDomainInDatabase);
        log.info("chamou UseCase 2 [{}]", produtoInDatabase.getId());
        return saveProduto(id, produtoInDatabase);
    }

    private ProdutoDomain saveProduto(String id, final ProdutoDomain produtoDomain) {
        log.info("chamou UseCase 3 [{}]", produtoDomain.getIdadeDomain().getIdade());
        return createProdutoGateway.create(id, produtoDomain);
    }

    private ProdutoDomain searchProdutoInDatabase(final String id) {
        try {
            return getProdutoGateway.findById(id);
        } catch (NotFoundException e) {
            return null;
        }
    }

}
