package com.examenfinal.administracionusuarios.service;

import com.examenfinal.administracionusuarios.entity.Usuarios;
import com.examenfinal.administracionusuarios.modelo.UsuariosDto;

import java.util.List;

public interface UsuariosService {

    Usuarios obtenerPorId(String id);

    Usuarios guardar(UsuariosDto usuariosDto);

    Usuarios modificar(String id, UsuariosDto usuariosDto);

    List<Usuarios> obtenerUsuarios();

    void remover(String id);
}
