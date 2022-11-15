package com.examenfinal.administracionusuarios.service;

public class UsuariosNoEncontradoException extends  RuntimeException {
    private final String id;

    public UsuariosNoEncontradoException(String message, String id) {
        super(message);
        this.id = id;
    }

    public static UsuariosNoEncontradoException from(String message, String id) {
        return new UsuariosNoEncontradoException(message, id);
    }

    public String getId() {
        return id;
    }
}
