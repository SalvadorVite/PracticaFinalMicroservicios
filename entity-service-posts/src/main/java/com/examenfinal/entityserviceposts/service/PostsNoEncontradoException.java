package com.examenfinal.entityserviceposts.service;

public class PostsNoEncontradoException extends RuntimeException {
    private final String id;

    public PostsNoEncontradoException(String message, String id) {
        super(message);
        this.id = id;
    }

    public static PostsNoEncontradoException from(String message, String id) {
        return new PostsNoEncontradoException(message, id);
    }

    public String getId() {
        return id;
    }
}
