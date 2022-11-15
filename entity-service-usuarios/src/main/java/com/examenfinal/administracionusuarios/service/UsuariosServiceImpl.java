package com.examenfinal.administracionusuarios.service;

import com.examenfinal.administracionusuarios.entity.Usuarios;
import com.examenfinal.administracionusuarios.modelo.UsuariosDto;
import com.examenfinal.administracionusuarios.repository.UsuariosRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UsuariosServiceImpl implements UsuariosService {

    private UsuariosRepository usuariosRepository;

    public UsuariosServiceImpl(UsuariosRepository usuariosRepository) {
        this.usuariosRepository = usuariosRepository;
    }

    @Override
    public Usuarios obtenerPorId(String id) {
        return usuariosRepository.findById(id)
                .orElseThrow(() -> UsuariosNoEncontradoException.from("Usuario no encontrado.", id));
    }

    @Override
    public Usuarios guardar(UsuariosDto usuariosDto) {
        Usuarios usuarios = Usuarios.from(usuariosDto);
        return usuariosRepository.save(usuarios);
    }

    @Override
    public Usuarios modificar(String id, UsuariosDto usuariosDto) {
        Usuarios usuarios = usuariosRepository.findById(id)
                .orElseThrow(() -> UsuariosNoEncontradoException.from("Usuario no registrado", id));

        usuarios = usuarios.from(usuariosDto);
        usuarios.setId(id);
        usuarios = usuariosRepository.save(usuarios);

        return usuarios;
    }

    @Override
    public List<Usuarios> obtenerUsuarios() {
        return usuariosRepository.findAll();
    }

    @Override
    public void remover(String id) {
        Usuarios usuarios = usuariosRepository.findById(id)
                .orElseThrow(() -> UsuariosNoEncontradoException.from("Usuario no registrado", id));

        usuariosRepository.delete(id);
    }
}
