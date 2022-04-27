package com.lpd.kafkatest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProducerController {

    @Autowired
   private KafkaTemplate<String,String> kafkaTemplate;

    @RequestMapping("/send")
    public String data(String msg)
    {
        kafkaTemplate.send("first",msg);
        return "success";
    }



}
