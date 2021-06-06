package com.cn.sky.mq;


import com.cn.sky.config.MQConfig;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 生产者
 */
@Component
public class Producer {

    private RabbitTemplate rabbitTemplate;

    @Autowired
    public Producer(RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
    }

    /**
     * 发生消息到RabbitMQ,使用SpringBoot默认的交换机<br>
     *
     * @param message
     */
    public void sendMessage(String message) {
        rabbitTemplate.convertAndSend(MQConfig.QUEUE_NAME, message);
    }

}