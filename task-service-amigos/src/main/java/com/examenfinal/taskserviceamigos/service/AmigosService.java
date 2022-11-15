package com.examenfinal.taskserviceamigos.service;

import com.examenfinal.taskserviceamigos.entity.Amigos;
import com.examenfinal.taskserviceamigos.modelo.AmigosDto;

import java.util.List;

public interface AmigosService {
    Amigos guardarAmigos(AmigosDto amigo);
    Amigos verAmigo(String id);
    List<Amigos> obtenerAmigos();
    Amigos modificaById(String id, Boolean status);
}
