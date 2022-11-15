package com.examenfinal.taskserviceamigos.api;

import com.examenfinal.taskserviceamigos.entity.Amigos;
import com.examenfinal.taskserviceamigos.modelo.AmigosDto;
import com.examenfinal.taskserviceamigos.modelo.TemplateResponse;
import com.examenfinal.taskserviceamigos.service.AmigosServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/amigos/v1")
public class AmigosController {
    @Autowired
    private AmigosServiceImpl amigosServicImpl;

    @PostMapping("")
    @ResponseStatus(HttpStatus.CREATED)
    public TemplateResponse crearAmigo(@RequestBody AmigosDto amigo) {
        Amigos crearAmigo = amigosServicImpl.guardarAmigos(amigo);
        TemplateResponse respCrear = new TemplateResponse("Buscando nuevo amigo.", "201", crearAmigo);
        return respCrear;
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Amigos verAmigo(@PathVariable("id") String id) {
        return amigosServicImpl.verAmigo(id);
    }

    @GetMapping("")
    @ResponseStatus(HttpStatus.OK)
    public List<Amigos> verAmigos() {
        return amigosServicImpl.obtenerAmigos();
    }

    @PutMapping("")
    @ResponseStatus(HttpStatus.OK)
    public TemplateResponse actualizarAmigo(@RequestBody AmigosDto amigos) {
        Amigos amigos1 = amigosServicImpl.modificaById(amigos.getIdAmistad(), amigos.getStatus());
        TemplateResponse r = new TemplateResponse("Amigo actualizado", "200", null);
        return r;
    }
}