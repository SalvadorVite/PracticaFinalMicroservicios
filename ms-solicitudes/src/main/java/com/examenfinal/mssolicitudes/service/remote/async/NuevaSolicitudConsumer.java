package com.examenfinal.mssolicitudes.service.remote.async;

import com.examenfinal.mssolicitudes.RabbitConfigConsumer;
import com.examenfinal.mssolicitudes.modelo.SolicitudesDto;
import com.examenfinal.mssolicitudes.service.SolicitudesService;
import com.google.gson.Gson;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class NuevaSolicitudConsumer {
    public static final Logger logger = LoggerFactory.getLogger(NuevaSolicitudConsumer.class);
    private Gson json = new Gson();
    private SolicitudesService solicitudesService;

    public NuevaSolicitudConsumer(SolicitudesService solicitudesService) {
        this.solicitudesService = solicitudesService;
    }

    @RabbitListener(queues = RabbitConfigConsumer.QUEUE_ADMINISTRACION_NUEVAS_SOLICITUDES)
    public void listenSolicitudes(Message message) {
        String body = new String(message.getBody());
        logger.info("Evento generación de solicitudes via RabbitMQ: " + body);
        SolicitudesDto solicitudesDto = json.fromJson(body, SolicitudesDto.class);
        solicitudesService.guardarSolicitudes(solicitudesDto);
    }
}
