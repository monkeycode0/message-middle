package com.cn.sky;


import com.cn.sky.mq.Producer;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author jaymin
 * 2020/12/30 17:54
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class SimpleMQTest {
    @Autowired
    private Producer simpleProducer;

    @Test
    public void test() throws InterruptedException {
        simpleProducer.sendMessage("消费者接收到了生产者发送的消息");
        Thread.sleep(10000);
    }

//    @Test
//    public void testOrder() throws Exception {
//        simpleProducer.sendOrderMessage(Order.builder()
//                .createTime(new Date())
//                .name("Phone")
//                .price("2000")
//                .build());
//        Thread.sleep(10000);
//    }
}