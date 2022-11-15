package com.examenfinal.mssolicitudes.api;

import com.examenfinal.mssolicitudes.entity.CatalogoSolicitudes;
import com.examenfinal.mssolicitudes.modelo.CatalogoSolicitudesDto;
import com.examenfinal.mssolicitudes.modelo.TemplateResponse;
import com.examenfinal.mssolicitudes.service.CatalogoSolicitudesServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/solicitudes/v1/catalogos")
public class CatalogosSolicitudesController {
    @Autowired
    private CatalogoSolicitudesServiceImpl catalogoSolicitudesService;

    @PostMapping("")
    @ResponseStatus(HttpStatus.CREATED)
    public TemplateResponse guardarCatalogosSolicitudes(@RequestBody CatalogoSolicitudesDto catalogoSolicitudesDto) {
        CatalogoSolicitudes solicitudesG = catalogoSolicitudesService.guardarCatalogos(catalogoSolicitudesDto);
        TemplateResponse templateResponse = new TemplateResponse("Solicitudes creadas.", "201", solicitudesG);
        return templateResponse;
    }

    @GetMapping("")
    @ResponseStatus(HttpStatus.OK)
    public List<CatalogoSolicitudes> obtenerCatalogos() {
        return catalogoSolicitudesService.obtenerCatalogos();
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public CatalogoSolicitudes obtenerCatalogo(@PathVariable("id") String id) {
        return catalogoSolicitudesService.obtenerCatalogo(id);
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public TemplateResponse obtenerSolicitud(@PathVariable("id") String id, @RequestBody CatalogoSolicitudesDto catalogoSolicitudesDto) {
        CatalogoSolicitudes catalogoSolicitudes = catalogoSolicitudesService.modificarCatalogo(id, catalogoSolicitudesDto);
        TemplateResponse templateResponse = new TemplateResponse("Solicitud actualizado.", "201", catalogoSolicitudes);
        return templateResponse;
    }
}