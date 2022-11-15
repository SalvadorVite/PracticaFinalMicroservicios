package com.examenfinal.administracionusuarios.api;

import com.examenfinal.administracionusuarios.entity.Usuarios;
import com.examenfinal.administracionusuarios.modelo.TemplateResponse;
import com.examenfinal.administracionusuarios.modelo.UsuariosDto;
import com.examenfinal.administracionusuarios.service.UsuariosService;
import com.examenfinal.administracionusuarios.service.UsuariosServiceImpl;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("usuarios/v1")
public class UsuariosController {

    private static final Logger log = Logger.getLogger(UsuariosController.class);
    @Autowired
    private UsuariosServiceImpl usuariosServiceImpl;

    @PostMapping("")
    @ResponseStatus(HttpStatus.CREATED)
    public TemplateResponse crear(@RequestBody UsuariosDto usuariosDto) {
        Usuarios usuarios = usuariosServiceImpl.guardar(usuariosDto);
        TemplateResponse response = new TemplateResponse("Usuarios creado exitosamente", "201", usuarios);
        return response;
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Usuarios usuariosPorID(@PathVariable("id") String id) {
        return usuariosServiceImpl.obtenerPorId(id);
    }

    @GetMapping("")
    @ResponseStatus(HttpStatus.OK)
    public List<Usuarios> usuarios() {
        return usuariosServiceImpl.obtenerUsuarios();
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public TemplateResponse modificarUsuariosPorID(@PathVariable("id") String id, @RequestBody UsuariosDto usuariosDto) {
        Usuarios usuarios = usuariosServiceImpl.modificar(id, usuariosDto);
        TemplateResponse response = new TemplateResponse("Usuario actualizado", "200", usuarios);
        return response;
    }
}
