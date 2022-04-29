package com.lpd.kafkatest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProducerController {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    @RequestMapping("/producer")
    public String machine(String host, String msg) {
        //  String topic,String id,String msg
        // kafkaTemplate.send(topic,id,msg);
        kafkaTemplate.send(host, msg);

        return "success";
    }

}