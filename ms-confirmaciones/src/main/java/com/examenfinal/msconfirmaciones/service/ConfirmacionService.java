package com.examenfinal.msconfirmaciones.service;

import com.examenfinal.msconfirmaciones.entity.Confirmaciones;
import com.examenfinal.msconfirmaciones.modelo.ConfirmacionDto;
import com.examenfinal.msconfirmaciones.modelo.ConfirmacionResumenDto;

import java.util.List;

public interface ConfirmacionService {
    Confirmaciones guardarConfirmaciones(ConfirmacionDto confirmacion);
    Confirmaciones obtenerConfirmacion(String id);
    List<Confirmaciones> obtenerConfirmaciones();
    ConfirmacionResumenDto modificaById(String id, Boolean respuesta);
}
