package com.lpd.kafkatest.controller;

        import org.springframework.context.annotation.Configuration;
        import org.springframework.kafka.annotation.KafkaListener;

@Configuration
public class ConsumerTopic {


    @KafkaListener(topics = {"first"})
    public void consumer(String msg)
    {
        System.out.println("从kafka拿到的消息:"+msg);
    }


}
