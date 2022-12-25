package br.com.assets.dataprovider.database.gateway;

import br.com.assets.core.common.mapper.ProdutoMapper;
import br.com.assets.core.domain.ProdutoDomain;
import br.com.assets.core.enumeration.ExceptionCode;
import br.com.assets.core.exception.NotFoundException;
import br.com.assets.core.gateway.GetProdutoGateway;
import br.com.assets.dataprovider.database.repository.ProdutoRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class GetProdutoGatewayImpl implements GetProdutoGateway {

    private final ProdutoRepository produtoRepository;

    private final ProdutoMapper produtoMapper;

    @Override
    public ProdutoDomain findById(String id) {

        final var produtoEntity = produtoRepository.findById(id).orElseThrow(() -> getNotFoundException(id));

        return produtoMapper.toDomain(produtoEntity);
    }

    private NotFoundException getNotFoundException(final String id) {
        return new NotFoundException(ExceptionCode.ASSETS_NOT_FOUND.name(),
                ExceptionCode.ASSETS_NOT_FOUND.message);
    }
}
