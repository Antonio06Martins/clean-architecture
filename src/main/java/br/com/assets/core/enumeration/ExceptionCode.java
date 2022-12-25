package br.com.assets.core.enumeration;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum ExceptionCode {

    ASSETS_NOT_FOUND("Assets not found", "MS_ASSETS_001");

    public final String message;
    public final String code;

}
