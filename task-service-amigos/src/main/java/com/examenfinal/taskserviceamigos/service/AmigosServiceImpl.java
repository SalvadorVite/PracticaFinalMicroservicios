package com.examenfinal.taskserviceamigos.service;

import com.examenfinal.taskserviceamigos.entity.Amigos;
import com.examenfinal.taskserviceamigos.modelo.AmigosDto;
import com.examenfinal.taskserviceamigos.modelo.remote.SolicitudesDto;
import com.examenfinal.taskserviceamigos.modelo.remote.SolicitudesResumenDto;
import com.examenfinal.taskserviceamigos.repository.AmigosRepository;
import com.examenfinal.taskserviceamigos.service.remote.SolicitudesServiceRemote;
import com.examenfinal.taskserviceamigos.service.remote.async.SolicitudProducer;
import com.google.gson.Gson;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AmigosServiceImpl implements AmigosService {

    @Autowired
    private AmigosRepository amigosRepository;

    @Autowired
    private SolicitudesServiceRemote solicitudesServiceRemote;

    Gson gson = new Gson();
    private Logger logger = Logger.getLogger(AmigosServiceImpl.class);

    @Autowired
    private SolicitudProducer solicitudProducer;

    @Override
    public Amigos guardarAmigos(AmigosDto amigo) {
        Amigos a = Amigos.from(amigo);
        Amigos res = amigosRepository.save(a);
        SolicitudesDto solicitudesDto = new SolicitudesDto();
        solicitudesDto.setIdUsuario(res.getIdUsuario());
        solicitudesDto.setIdTipoSolicitud("2");
        solicitudesDto.setStatus(Boolean.FALSE);
        solicitudesDto.setDetallesSolicitud("Solicitud en proceso via Rabbit MQ.");
        solicitudProducer.sendMessage(gson.toJson(solicitudesDto));
        //SolicitudesResumenDto templateResponse = solicitudesServiceRemote.confirmacionesSolicitud(solicitudesDto);
        //logger.info("Respuesta api: " + gson.toJson(templateResponse));
        return res;
    }

    @Override
    public Amigos verAmigo(String id) {
        return amigosRepository.findOne(id);
    }

    @Override
    public List<Amigos> obtenerAmigos() {
        return amigosRepository.findAll();
    }

    @Override
    public Amigos modificaById(String id, Boolean status) {
        Amigos amigos = amigosRepository.findOne(id);
        amigos.setId(id);
        amigos.setStatus(status);
        Amigos aResp = amigosRepository.save(amigos);
        return aResp;
    }
}
