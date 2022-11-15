package com.examenfinal.taskserviceamigos.service.remote;

import com.examenfinal.taskserviceamigos.modelo.remote.SolicitudesDto;
import com.examenfinal.taskserviceamigos.modelo.remote.SolicitudesResumenDto;
import org.springframework.stereotype.Component;

@Component
public class SolicitudesServiceClientFallback implements SolicitudesServiceRemote {

    @Override
    public SolicitudesResumenDto confirmacionesSolicitud(SolicitudesDto confirmaciones) {
        return new SolicitudesResumenDto();
    }
}
