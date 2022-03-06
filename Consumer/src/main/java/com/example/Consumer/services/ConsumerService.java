package com.example.Consumer.services;

import com.example.Consumer.models.KafkaMessage;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class ConsumerService {

    @KafkaListener(topics = "msgStr", groupId = "message_group_id")
    public void consume(String message) {
        System.out.println(message);
    }
}
