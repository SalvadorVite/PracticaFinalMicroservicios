package com.examenfinal.msconfirmaciones.service;

public class ConfirmacionesNoEncontradoException extends RuntimeException {
    private final String id;

    public ConfirmacionesNoEncontradoException(String message, String id) {
        super(message);
        this.id = id;
    }

    public static ConfirmacionesNoEncontradoException from(String message, String id) {
        return new ConfirmacionesNoEncontradoException(message, id);
    }

    public String getId() {
        return id;
    }
}
