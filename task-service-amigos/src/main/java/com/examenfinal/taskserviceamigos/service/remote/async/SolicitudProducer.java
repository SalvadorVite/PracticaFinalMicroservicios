package com.examenfinal.taskserviceamigos.service.remote.async;

import com.examenfinal.taskserviceamigos.RabbitConfigConsumer;
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
        rabbitTemplate.convertAndSend(RabbitConfigConsumer.QUEUE_ADMINISTRACION_NUEVAS_SOLICITUDES, contractEvent);
        logger.info(">>> Generando solicitud de amistad via RabbitMQ...");
    }
}