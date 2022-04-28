package com.lpd.kafkatest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProducerController {

    @Autowired
   private KafkaTemplate<String,String> kafkaTemplate;
    @RequestMapping("/producer")
    public String machine()
    {
      //  String topic,String id,String msg
      // kafkaTemplate.send(topic,id,msg);
        kafkaTemplate.send("192.168.110.52","nima4554");

        return "success";
    }

 /*   @RequestMapping("/producer40")
    public String machine40(String msg)
    {
        kafkaTemplate.send("192.168.110.40",msg);
        return "success";
    }


    @RequestMapping("/producer145")
    public String machine145(String msg)
    {
        kafkaTemplate.send("192.168.110.145",msg);
        return "success";
    }
*/
}
