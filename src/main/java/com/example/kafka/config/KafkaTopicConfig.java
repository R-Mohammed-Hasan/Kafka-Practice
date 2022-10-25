package com.example.kafka.config;


import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
// This class creates all objects required before running the entire application
public class KafkaTopicConfig {

    @Bean
    public NewTopic newTopic(){
        System.out.println("New topic created");
        return TopicBuilder.name("hasan").build();
    }

    @Bean
    public NewTopic newJsonTopic(){
        System.out.println("New topic created");
        return TopicBuilder.name("hasan_json").build();
    }
}
