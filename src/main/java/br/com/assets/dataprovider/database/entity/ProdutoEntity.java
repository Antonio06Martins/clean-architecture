package br.com.assets.dataprovider.database.entity;

import br.com.assets.core.domain.IdadeDomain;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Builder
@AllArgsConstructor
@Document(collection = "produto")
public class ProdutoEntity {

    private String id;
    private String nome;
    @JsonProperty("idade_domain")
    private IdadeDomain idadeDomain;
}
