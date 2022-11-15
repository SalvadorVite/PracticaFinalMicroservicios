package com.examenfinal.mssolicitudes.service;

public class SolicitudesNoEncontradoException extends RuntimeException {
    private final String id;

    public SolicitudesNoEncontradoException(String message, String id) {
        super(message);
        this.id = id;
    }

    public static SolicitudesNoEncontradoException from(String message, String id) {
        return new SolicitudesNoEncontradoException(message, id);
    }

    public String getId() {
        return id;
    }
}
