package com.examenfinal.msconfirmaciones.service.remote.async;

import com.examenfinal.msconfirmaciones.RabbitConfigConsumer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Component;

@Component
public class SolicitudProducer {
    private RabbitTemplate rabbitTemplate;

    public static final Logger logger = LoggerFactory.getLogger(SolicitudProducer.class);

    public SolicitudProducer(RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
    }

    public void sendMessage(String contractEvent) {
        rabbitTemplate.convertAndSend(RabbitConfigConsumer.QUEUE_ADMINISTRACION_CONFIRMACION_SOLICITUDES, contractEvent);
        logger.info(">>> Confirmando solicitud de amistad via RabbitMQ...");
    }
}