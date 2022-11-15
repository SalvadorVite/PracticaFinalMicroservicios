package com.examenfinal.msconfirmaciones.service.remote;

import com.examenfinal.msconfirmaciones.modelo.remote.SolicitudesDto;
import com.examenfinal.msconfirmaciones.modelo.remote.SolicitudesResumenDto;
import org.springframework.stereotype.Component;

@Component
public class SolicitudesServiceClientFallback implements SolicitudesServiceRemote {

    @Override
    public SolicitudesResumenDto confirmacionesSolicitud(String id, SolicitudesDto confirmaciones) {
        return new SolicitudesResumenDto();
    }
}
