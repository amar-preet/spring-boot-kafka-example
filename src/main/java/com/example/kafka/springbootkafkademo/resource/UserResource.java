package com.example.kafka.springbootkafkademo.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("kafka")
public class UserResource {

    @Autowired
    KafkaTemplate<String, String> kafkaTemplate;
    private  static final String TOPIC = "kafka-demo";

    @GetMapping("/publish")
    public String BasicMessage(){

        String[] inputMessages = {"John", "Doe", "James"};
        for(String msg : inputMessages){
            kafkaTemplate.send(TOPIC, msg);
        }

        return "Message Published";

    }
}



