package com.cn.sky.mq;

import com.cn.sky.config.MQConfig;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * 消费者
 */
@Component
@Slf4j
public class Consumer {

    @RabbitListener(queues = {MQConfig.QUEUE_NAME})
    @RabbitHandler
    public void receiveMessage(String message) {
        log.info("消费者接收到消息:{}", message);
    }

}