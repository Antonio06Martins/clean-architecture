package br.com.assets.entrypoint.api.controller;

import br.com.assets.core.domain.AssetsDomain;
import br.com.assets.entrypoint.api.dto.output.AssetsOutputDTO;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

public interface AssetsController {

    @PutMapping("v1/assets/{id}")
    AssetsOutputDTO upsert(
            @PathVariable("id") String id,
            @RequestHeader(value = "identify_id") String identifyId,
            @RequestBody AssetsDomain input);
}
