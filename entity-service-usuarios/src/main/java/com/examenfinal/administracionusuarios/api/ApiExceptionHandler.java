package com.examenfinal.administracionusuarios.api;

import com.examenfinal.administracionusuarios.service.UsuariosNoEncontradoException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.http.HttpEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;

@RestControllerAdvice
public class ApiExceptionHandler {

    @Autowired
    private ObjectMapper objectMapper;

    @ExceptionHandler(UsuariosNoEncontradoException.class)
    public HttpEntity notFound(UsuariosNoEncontradoException exception) {
        HashMap<String, Object> body = new HashMap<>();
        body.put("id", exception.getId());
        body.put("message", exception.getMessage());

        return (HttpEntity) ResponseEntity.status(HttpStatus.NOT_FOUND).body(body);
    }
}
