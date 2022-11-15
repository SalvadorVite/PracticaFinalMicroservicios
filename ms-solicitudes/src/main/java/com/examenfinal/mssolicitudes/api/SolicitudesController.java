package com.examenfinal.mssolicitudes.api;

import com.examenfinal.mssolicitudes.entity.Solicitudes;
import com.examenfinal.mssolicitudes.modelo.SolicitudesDto;
import com.examenfinal.mssolicitudes.modelo.SolicitudesResumenDto;
import com.examenfinal.mssolicitudes.modelo.TemplateResponse;
import com.examenfinal.mssolicitudes.service.CatalogoSolicitudesServiceImpl;
import com.examenfinal.mssolicitudes.service.SolicitudesServiceImpl;
import com.google.gson.Gson;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/solicitudes/v1")
public class SolicitudesController {
    @Autowired
    private SolicitudesServiceImpl solicitudesService;

    private Logger logger = Logger.getLogger(SolicitudesController.class);
    Gson gson = new Gson();

    @PostMapping("")
    @ResponseStatus(HttpStatus.CREATED)
    public SolicitudesResumenDto guardarSolicitudes(@RequestBody SolicitudesDto solicitudesDto) {
        SolicitudesResumenDto solicitudesG = solicitudesService.guardarSolicitudes(solicitudesDto);
        logger.info("Peticion: " + gson.toJson(solicitudesDto) + ", Respuesta: " + gson.toJson(solicitudesG));
        return solicitudesG;
    }

    @GetMapping("")
    @ResponseStatus(HttpStatus.OK)
    public List<Solicitudes> obtenerSolicitudes() {
        return solicitudesService.obtenerSolicitudes();
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Solicitudes obtenerSolicitud(@PathVariable("id") String id) {
        return solicitudesService.obtenerSolicitud(id);
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public SolicitudesResumenDto obtenerSolicitud(@PathVariable("id") String id, @RequestBody SolicitudesDto solicitudesDto) {
        SolicitudesResumenDto solicitudes = solicitudesService.modificarSolicitud(id, solicitudesDto);
        return solicitudes;
    }
}
