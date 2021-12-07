package com.tortilla.f1.telemetry.kafka.topic;

import com.tortilla.f1.telemetry.util.TopicConstants;
import org.apache.kafka.clients.admin.AdminClientConfig;
import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.core.KafkaAdmin;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class KafkaTopicConfig implements TopicConstants {

    @Value(value = "${kafka.bootstrapAddress}")
    private String bootstrapAddress;

    @Bean
    public KafkaAdmin kafkaAdmin() {
        Map<String, Object> configs = new HashMap<>();
        configs.put(AdminClientConfig.BOOTSTRAP_SERVERS_CONFIG, bootstrapAddress);
        return new KafkaAdmin(configs);
    }

    @Bean
    public NewTopic session() {
        return new NewTopic(session, 1, (short) 1);
    }

    @Bean
    public NewTopic motion() {
        return new NewTopic(motion, 1, (short) 1);
    }

    @Bean
    public NewTopic lapData() {
        return new NewTopic(lapData, 1, (short) 1);
    }

    @Bean
    public NewTopic event() {
        return new NewTopic(event, 1, (short) 1);
    }

    @Bean
    public NewTopic participants() {
        return new NewTopic(participants, 1, (short) 1);
    }

    @Bean
    public NewTopic carSetups() {
        return new NewTopic(carSetups, 1, (short) 1);
    }

    @Bean
    public NewTopic carTelemetry() {
        return new NewTopic(carTelemetry, 1, (short) 1);
    }

    @Bean
    public NewTopic carStatus() {
        return new NewTopic(carStatus, 1, (short) 1);
    }

    @Bean
    public NewTopic finalClassification() {
        return new NewTopic(finalClassification, 1, (short) 1);
    }

    @Bean
    public NewTopic lobbyInfo() {
        return new NewTopic(lobbyInfo, 1, (short) 1);
    }


}