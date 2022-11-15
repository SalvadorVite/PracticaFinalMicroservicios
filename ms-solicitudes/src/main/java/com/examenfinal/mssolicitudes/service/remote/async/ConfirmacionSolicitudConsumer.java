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
public class ConfirmacionSolicitudConsumer {
    public static final Logger logger = LoggerFactory.getLogger(ConfirmacionSolicitudConsumer.class);
    private Gson json = new Gson();
    private SolicitudesService solicitudesService;

    public ConfirmacionSolicitudConsumer(SolicitudesService solicitudesService) {
        this.solicitudesService = solicitudesService;
    }

    @RabbitListener(queues = RabbitConfigConsumer.QUEUE_ADMINISTRACION_CONFIRMACION_SOLICITUDES)
    public void listenSolicitudes(Message message) {
        String body = new String(message.getBody());
        logger.info("Evento confirmación de solicitudes via RabbitMQ: " + body);
        SolicitudesDto solicitudesDto = json.fromJson(body, SolicitudesDto.class);
        solicitudesService.modificarSolicitud(solicitudesDto.getId(), solicitudesDto);
    }
}
