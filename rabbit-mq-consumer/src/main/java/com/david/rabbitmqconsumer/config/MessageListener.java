package com.david.rabbitmqconsumer.config;

import com.david.rabbitmqconsumer.model.CustomMessage;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class MessageListener {


    @RabbitListener(queues= MQConfig.QUEUE)
    public void Listener(CustomMessage message){
        System.out.println(message);

    }
}
