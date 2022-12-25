package br.com.assets.core.exception;

import lombok.Getter;

public class NotFoundException extends RuntimeException {

    @Getter
    private final String errorCode;

    public NotFoundException(String errorCode, String message) {
        super(message);
        this.errorCode = errorCode;
    }
}
