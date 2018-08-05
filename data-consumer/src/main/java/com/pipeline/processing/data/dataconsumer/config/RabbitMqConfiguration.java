package com.pipeline.processing.data.dataconsumer.config;

import com.pipeline.processing.data.dataconsumer.message.MessageInputBinder;
import org.springframework.amqp.core.*;
import org.springframework.amqp.rabbit.connection.CachingConnectionFactory;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitAdmin;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableBinding(MessageInputBinder.class)
public class RabbitMqConfiguration {

/*    @Value("${amqp.host}")
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

    @Value("${amqp.queue}")
    private String queue;

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
    public Queue userDataQueue() {return new Queue(queue);}

    @Bean
    public boolean createAndBindQueue()
    {
        AmqpAdmin amqpAdmin = new RabbitAdmin(connectionFactory());
        amqpAdmin.declareQueue(userDataQueue());

        amqpAdmin.declareBinding(userDataQueueBinding);
        return true;
    }*/

}
