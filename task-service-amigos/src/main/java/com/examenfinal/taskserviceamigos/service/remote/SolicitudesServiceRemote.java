package com.examenfinal.taskserviceamigos.service.remote;

import com.examenfinal.taskserviceamigos.modelo.remote.SolicitudesDto;
import com.examenfinal.taskserviceamigos.modelo.remote.SolicitudesResumenDto;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "api-solicitudes", fallback = SolicitudesServiceClientFallback.class, configuration = ClientRemoteConfig.class)
public interface SolicitudesServiceRemote {

    @RequestMapping(method = RequestMethod.POST, value = "/solicitudes/v1", produces = "application/json")
    SolicitudesResumenDto confirmacionesSolicitud(@RequestBody SolicitudesDto solicitudesDto);

}
