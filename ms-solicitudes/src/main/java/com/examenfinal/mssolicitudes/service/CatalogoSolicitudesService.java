package com.examenfinal.mssolicitudes.service;

import com.examenfinal.mssolicitudes.entity.CatalogoSolicitudes;
import com.examenfinal.mssolicitudes.modelo.CatalogoSolicitudesDto;
import com.examenfinal.mssolicitudes.modelo.SolicitudesDto;

import java.util.List;

public interface CatalogoSolicitudesService {

    CatalogoSolicitudes guardarCatalogos(CatalogoSolicitudesDto catalogoSolicitudesDto);
    CatalogoSolicitudes obtenerCatalogo(String id);
    List<CatalogoSolicitudes> obtenerCatalogos();
    CatalogoSolicitudes modificarCatalogo(String id, CatalogoSolicitudesDto catalogoSolicitudesDto);
}
