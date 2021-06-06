package com.cn.sky.config;


import lombok.Getter;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 */
@Configuration
@Getter
public class MQConfig {
    /**
     * 队列名
     */
    public static final String QUEUE_NAME = "rbmq.demo.queue";

    @Bean
    public Queue queue() {
        return new Queue(QUEUE_NAME);
    }


}