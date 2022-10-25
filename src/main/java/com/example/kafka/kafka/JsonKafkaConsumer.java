package com.example.kafka.kafka;


import com.example.kafka.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class JsonKafkaConsumer {

    private static final Logger LOGGER = LoggerFactory.getLogger(JsonKafkaConsumer.class);

    @KafkaListener(topics = "hasan_json",groupId = "group")
    public void consumer(User user){
        LOGGER.info(String.format("JSON Message received is -> %s",user.toString()));
    }

}
