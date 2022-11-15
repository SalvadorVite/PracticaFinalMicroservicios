package com.examenfinal.mssolicitudes.service;

import com.examenfinal.mssolicitudes.entity.Solicitudes;
import com.examenfinal.mssolicitudes.modelo.SolicitudesDto;
import com.examenfinal.mssolicitudes.modelo.SolicitudesResumenDto;

import java.util.List;

public interface SolicitudesService {
    SolicitudesResumenDto guardarSolicitudes(SolicitudesDto catalogoSolicitudesDto);
    Solicitudes obtenerSolicitud(String id);
    List<Solicitudes> obtenerSolicitudes();
    SolicitudesResumenDto modificarSolicitud(String id, SolicitudesDto solicitudes);
}
