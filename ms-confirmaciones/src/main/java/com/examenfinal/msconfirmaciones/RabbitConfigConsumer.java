package com.examenfinal.msconfirmaciones;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitConfigConsumer {

    public final static String QUEUE_ADMINISTRACION_CONFIRMACION_SOLICITUDES = "queue-administracion-confirmacion-solicitudes";

    @Bean
    Queue queue() {
        return new Queue(QUEUE_ADMINISTRACION_CONFIRMACION_SOLICITUDES);
    }

    @Bean
    TopicExchange exchange() {
        return new TopicExchange("exchange-principal");
    }

    @Bean
    Binding binding(Queue queue, TopicExchange topicExchange) {
        return BindingBuilder.bind(queue).to(topicExchange).with(QUEUE_ADMINISTRACION_CONFIRMACION_SOLICITUDES);
    }
}
