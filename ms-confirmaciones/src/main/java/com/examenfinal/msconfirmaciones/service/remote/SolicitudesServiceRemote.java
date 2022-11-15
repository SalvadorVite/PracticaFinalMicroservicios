package com.examenfinal.msconfirmaciones.service.remote;

import com.examenfinal.msconfirmaciones.modelo.remote.SolicitudesDto;
import com.examenfinal.msconfirmaciones.modelo.remote.SolicitudesResumenDto;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "api-solicitudes", fallback = SolicitudesServiceClientFallback.class, configuration = ClientRemoteConfig.class)
public interface SolicitudesServiceRemote {

    @RequestMapping(method = RequestMethod.PUT, value = "/solicitudes/v1/{id}", produces = "application/json")
    SolicitudesResumenDto confirmacionesSolicitud(@PathVariable("id") String id, @RequestBody SolicitudesDto solicitudesDto);

}
