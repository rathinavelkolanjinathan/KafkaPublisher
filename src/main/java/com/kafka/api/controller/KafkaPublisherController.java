package com.kafka.api.controller;

import com.kafka.api.dto.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KafkaPublisherController {
    @Autowired
    private KafkaTemplate<String, Object> kafkaTemplate;

    private String topicName = "produce1";

    @GetMapping("/publish/{name}")
    public String publishMessage(@PathVariable String name) {
        kafkaTemplate.send(topicName, "Hi " + name + " Welcome to kafka publisher Test");
        return "Data published";
    }

    @GetMapping("/publishJson")
    public String publishMessage() {
        User user = new User(10, "user01", new String[]{"Chennai", "Madurai", "Plat No-56"});
        kafkaTemplate.send(topicName, user);
        return "Json Data published to kafka";
    }

}
