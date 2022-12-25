package br.com.assets.core.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
@Builder
@AllArgsConstructor
public class AssetsDomain {

    private String id;

    @JsonProperty("identify_id")
    private String identifyId;

    @JsonProperty("car_domain")
    private CarDomain carDomain;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime createdData;

    public AssetsDomain update(final String identifyId,
                               final AssetsDomain assetsDomain,
                               final LocalDateTime createdData) {

        this.identifyId = identifyId;
        this.carDomain = assetsDomain.carDomain;
        this.createdData = createdData;

        return this;
    }
}
