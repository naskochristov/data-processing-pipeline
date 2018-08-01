package com.pipeline.processing.data.dataproducer.config;

import org.springframework.amqp.core.AmqpAdmin;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.amqp.rabbit.connection.CachingConnectionFactory;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitAdmin;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMqConfiguration {

    @Value("${amqp.host}")
    private String host;

    @Value("${amqp.port}")
    private int port;

    @Value("${amqp.user}")
    private String username;

    @Value("${amqp.pwd}")
    private String password;

    @Value("${amqp.vhost}")
    private String virtual_host;

    @Value("${amqp.exchange}")
    private String exchange;

    @Bean
    public ConnectionFactory connectionFactory() {
        CachingConnectionFactory connectionFactory = new CachingConnectionFactory();
        connectionFactory.setHost(host);
        connectionFactory.setPort(port);
        connectionFactory.setUsername(username);
        connectionFactory.setPassword(password);
        connectionFactory.setVirtualHost(virtual_host);
        return connectionFactory;
    }

    @Bean
    public TopicExchange userDataExchange() {
        return new TopicExchange(exchange, true, false);
    }

    @Bean
    public boolean declareExchange()
    {
        AmqpAdmin amqpAdmin = new RabbitAdmin(connectionFactory());
        amqpAdmin.declareExchange(userDataExchange());
        return true;
    }

}
