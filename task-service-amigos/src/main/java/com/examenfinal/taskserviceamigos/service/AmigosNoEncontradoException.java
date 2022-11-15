package com.examenfinal.taskserviceamigos.service;

public class AmigosNoEncontradoException extends RuntimeException {
    private final String id;

    public AmigosNoEncontradoException(String message, String id) {
        super(message);
        this.id = id;
    }

    public static AmigosNoEncontradoException from(String message, String id) {
        return new AmigosNoEncontradoException(message, id);
    }

    public String getId() {
        return id;
    }
}
