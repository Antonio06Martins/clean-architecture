package br.com.assets.entrypoint.api.dto.output;

import br.com.assets.core.domain.IdadeDomain;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;

@Builder
public record ProdutoOutputDTO(

        @JsonProperty("nome")
        String nome,
        @JsonProperty("idade_domain")
        IdadeDomain idadeDomain
) {
    @Builder
    public static record IdadeDomain(
            @JsonProperty("idade")
            String idade
    )
    {

    }
}
