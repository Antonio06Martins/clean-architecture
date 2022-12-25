package br.com.assets.dataprovider.database.entity;

import br.com.assets.core.domain.CarDomain;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Getter
@Builder
@AllArgsConstructor
@Document(collection = "assets")
public class AssetsEntity {

    private String id;

    @JsonProperty("identify_id")
    private String identifyId;

    @JsonProperty("car_domain")
    private CarDomain carDomain;

    @JsonProperty("created_data")
    private LocalDateTime createdData;
}
