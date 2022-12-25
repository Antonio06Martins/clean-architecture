package br.com.assets.core.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
@AllArgsConstructor
public class ProdutoDomain {

    private String id;
    private String nome;
    @JsonProperty("idade_domain")
    private IdadeDomain idadeDomain;

    public ProdutoDomain update(ProdutoDomain produtoDomain) {
        this.nome = produtoDomain.nome;
        this.idadeDomain = produtoDomain.idadeDomain;

        return this;
    }
}
