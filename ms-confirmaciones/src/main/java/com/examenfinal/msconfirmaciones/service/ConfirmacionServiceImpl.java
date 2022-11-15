package com.examenfinal.msconfirmaciones.service;

import com.examenfinal.msconfirmaciones.entity.Confirmaciones;
import com.examenfinal.msconfirmaciones.modelo.ConfirmacionDto;
import com.examenfinal.msconfirmaciones.modelo.ConfirmacionResumenDto;
import com.examenfinal.msconfirmaciones.modelo.remote.SolicitudesDto;
import com.examenfinal.msconfirmaciones.modelo.remote.SolicitudesResumenDto;
import com.examenfinal.msconfirmaciones.repository.ConfirmacionRespository;
import com.examenfinal.msconfirmaciones.service.remote.SolicitudesServiceRemote;
import com.examenfinal.msconfirmaciones.service.remote.async.SolicitudProducer;
import com.google.gson.Gson;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Date;
import java.util.List;

@Service
public class ConfirmacionServiceImpl implements ConfirmacionService {
    @Autowired
    private ConfirmacionRespository confirmacionRespository;

    Gson gson = new Gson();
    private Logger log = Logger.getLogger(ConfirmacionServiceImpl.class);
    @Autowired
    private SolicitudProducer solicitudProducer;

    @Override
    public Confirmaciones guardarConfirmaciones(ConfirmacionDto confirmacionesDto) {
        Confirmaciones confirmaciones = Confirmaciones.from(confirmacionesDto);
        SolicitudesDto solicitudesDto = new SolicitudesDto();
        solicitudesDto.setId(confirmacionesDto.getIdSolicitudAmistad());
        solicitudesDto.setStatus(confirmacionesDto.getStatus());
        solicitudesDto.setDetallesSolicitud("Actualizando solicitud via RabbitMQ.");
        solicitudProducer.sendMessage(gson.toJson(solicitudesDto));
        //SolicitudesResumenDto solicitudesResumenDto = solicitudesServiceRemote.confirmacionesSolicitud(confirmacionesDto.getIdSolicitudAmistad(), solicitudesDto);
        //log.info("Feign >>> Peticion: " + gson.toJson(solicitudesDto) + ", REspuesta: " + gson.toJson(solicitudesResumenDto));
        return confirmacionRespository.save(confirmaciones);
    }

    @Override
    public Confirmaciones obtenerConfirmacion(String id) {
        return confirmacionRespository.findOne(id);
    }

    @Override
    public List<Confirmaciones> obtenerConfirmaciones() {
        return confirmacionRespository.findAll();
    }

    @Override
    public ConfirmacionResumenDto modificaById(String id, Boolean respuesta) {
        Confirmaciones confirmacion = confirmacionRespository.findOne(id);
        confirmacion.setId(id);
        confirmacion.setFechaConfirmacion(new Date().toString());
        confirmacion.setStatus(respuesta);

        Confirmaciones confirmaciones = confirmacionRespository.save(confirmacion);
        ConfirmacionResumenDto actualizado = new ConfirmacionResumenDto();
        actualizado.setIdConfirmacion(confirmaciones.getId());
        actualizado.setRespuesta(confirmaciones.getRespuestaSolicitud());
        actualizado.setDetalle(confirmaciones.getDetallesSolicitud());
        return actualizado;
    }
}
