package com.examenfinal.mssolicitudes.api;

import com.examenfinal.mssolicitudes.service.SolicitudesNoEncontradoException;
import org.apache.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;

@RestControllerAdvice
public class ApiExceptionHandler {

    @ExceptionHandler(SolicitudesNoEncontradoException.class)
    public HttpEntity notFound(SolicitudesNoEncontradoException exception) {
        HashMap<String, Object> body = new HashMap<>();
        body.put("id", exception.getId());
        body.put("message", exception.getMessage());

        return (HttpEntity) ResponseEntity.status(HttpStatus.NOT_FOUND).body(body);
    }
}
