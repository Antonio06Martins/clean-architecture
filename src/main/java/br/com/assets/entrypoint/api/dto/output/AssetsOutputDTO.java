package br.com.assets.entrypoint.api.dto.output;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Builder
public record AssetsOutputDTO(
        @JsonProperty("identify_id")
        String identifyId,

        @JsonProperty("car_domain")
        CarDomain carDomain,

        @JsonProperty("created_data")
        LocalDateTime createdData
) {
    @Builder
    public static record CarDomain(
            @JsonProperty("plate")
            String plate,

            @JsonProperty("model")
            String model,

            @JsonProperty("value")
            BigDecimal value
    )
    {
    }
}
