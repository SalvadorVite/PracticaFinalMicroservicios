package com.examenfinal.mssolicitudes.service;

import com.examenfinal.mssolicitudes.entity.Solicitudes;
import com.examenfinal.mssolicitudes.modelo.SolicitudesDto;
import com.examenfinal.mssolicitudes.modelo.SolicitudesResumenDto;
import com.examenfinal.mssolicitudes.repository.SolicitudesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class SolicitudesServiceImpl implements SolicitudesService {
    @Autowired
    private SolicitudesRepository solicitudesRepository;

    @Override
    public SolicitudesResumenDto guardarSolicitudes(SolicitudesDto catalogoSolicitudesDto) {
        Solicitudes solicitudesS = Solicitudes.from(catalogoSolicitudesDto);
        Solicitudes solicitudes = solicitudesRepository.save(solicitudesS);
        SolicitudesResumenDto resumenDto = new SolicitudesResumenDto();
        resumenDto.setIdSolicitud(solicitudes.getId());
        resumenDto.setFechaSolicitud(solicitudes.getFechaSolicitud());
        resumenDto.setDetallesSolicitud(solicitudes.getDetallesSolicitud());
        resumenDto.setStatus(solicitudes.getStatus());
        return resumenDto;
    }

    @Override
    public Solicitudes obtenerSolicitud(String id) {
        return solicitudesRepository.findOne(id);
    }

    @Override
    public List<Solicitudes> obtenerSolicitudes() {
        return solicitudesRepository.findAll();
    }

    @Override
    public SolicitudesResumenDto modificarSolicitud(String id, SolicitudesDto solicitudes) {
        Solicitudes solicitudes1 = solicitudesRepository.findOne(id);
        solicitudes1.setId(id);
        solicitudes1.setFechaOperacion(new Date().toString());
        solicitudes1.setStatus(solicitudes.getStatus());
        solicitudes1.setDetallesSolicitud(solicitudes.getDetallesSolicitud());
        Solicitudes solicitudesResp = solicitudesRepository.save(solicitudes1);
        SolicitudesResumenDto resumenDto = new SolicitudesResumenDto();
        resumenDto.setIdSolicitud(solicitudes.getId());
        resumenDto.setFechaSolicitud(solicitudes.getFechaSolicitud());
        resumenDto.setDetallesSolicitud(solicitudes.getDetallesSolicitud());
        resumenDto.setStatus(solicitudes.getStatus());
        return resumenDto;
    }
}
