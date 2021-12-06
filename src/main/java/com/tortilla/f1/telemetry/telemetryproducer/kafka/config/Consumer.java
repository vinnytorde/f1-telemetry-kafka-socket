package com.tortilla.f1.telemetry.telemetryproducer.kafka.config;

import com.tortilla.f1.telemetry.telemetryproducer.model.*;
import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.common.serialization.StringDeserializer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.config.ConcurrentKafkaListenerContainerFactory;
import org.springframework.kafka.core.ConsumerFactory;
import org.springframework.kafka.core.DefaultKafkaConsumerFactory;
import org.springframework.kafka.support.serializer.JsonDeserializer;

import java.util.HashMap;
import java.util.Map;

@EnableKafka
@Configuration
public class Consumer {
    @Value(value = "${kafka.bootstrapAddress}")
    private String bootstrapAddress;

    private <T> ConsumerFactory<String, T> getConsumerFactory(Class type) {
        Map<String, Object> props = new HashMap<>();
        props.put(
                ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG,
                bootstrapAddress);
        props.put(
                ConsumerConfig.GROUP_ID_CONFIG,
                "telemetry-producer");
        return new DefaultKafkaConsumerFactory<>(props,
                new StringDeserializer(),
                new JsonDeserializer<>(type)
        );
    }

    private <T> ConcurrentKafkaListenerContainerFactory<String, T> getKafkaListenerContainerFactory(ConsumerFactory<String, T> consumerFactory) {
        ConcurrentKafkaListenerContainerFactory<String, T> factory =
                new ConcurrentKafkaListenerContainerFactory<>();
        factory.setConsumerFactory(consumerFactory);
        return factory;
    }

    @Bean
    public ConsumerFactory<String, SessionPacket> consumerFactory() {
        return getConsumerFactory(SessionPacket.class);
    }

    @Bean
    public ConcurrentKafkaListenerContainerFactory<String, SessionPacket> kafkaListenerContainerFactory() {
        return getKafkaListenerContainerFactory(consumerFactory());
    }

    @Bean
    public ConsumerFactory<String, SessionPacket> sessionConsumerFactory() {
        return getConsumerFactory(SessionPacket.class);
    }

    @Bean
    public ConcurrentKafkaListenerContainerFactory<String, SessionPacket> sessionContainerFactory() {
        return getKafkaListenerContainerFactory(sessionConsumerFactory());
    }

    @Bean
    public ConsumerFactory<String, MotionPacket> motionConsumerFactory() {
        return getConsumerFactory(MotionPacket.class);
    }

    @Bean
    public ConcurrentKafkaListenerContainerFactory<String, MotionPacket> motionContainerFactory() {
        return getKafkaListenerContainerFactory(motionConsumerFactory());
    }

    @Bean
    public ConsumerFactory<String, LapDataPacket> lapDataConsumerFactory() {
        return getConsumerFactory(LapDataPacket.class);
    }

    @Bean
    public ConcurrentKafkaListenerContainerFactory<String, LapDataPacket> lapDataContainerFactory() {
        return getKafkaListenerContainerFactory(lapDataConsumerFactory());
    }

    @Bean
    public ConsumerFactory<String, EventPacket> eventConsumerFactory() {
        return getConsumerFactory(EventPacket.class);
    }

    @Bean
    public ConcurrentKafkaListenerContainerFactory<String, EventPacket> eventContainerFactory() {
        return getKafkaListenerContainerFactory(eventConsumerFactory());
    }

    public ConsumerFactory<String, ParticipantsPacket> participantsConsumerFactory() {
        return getConsumerFactory(ParticipantsPacket.class);
    }

    @Bean
    public ConcurrentKafkaListenerContainerFactory<String, ParticipantsPacket> participantsContainerFactory() {
        return getKafkaListenerContainerFactory(participantsConsumerFactory());
    }

    @Bean
    public ConsumerFactory<String, CarSetupsPacket> carSetupsConsumerFactory() {
        return getConsumerFactory(CarSetupsPacket.class);
    }

    @Bean
    public ConcurrentKafkaListenerContainerFactory<String, CarSetupsPacket> carSetupsContainerFactory() {
        return getKafkaListenerContainerFactory(carSetupsConsumerFactory());
    }

    @Bean
    public ConsumerFactory<String, CarTelemetryPacket> carTelemetryConsumerFactory() {
        return getConsumerFactory(CarTelemetryPacket.class);
    }

    @Bean
    public ConcurrentKafkaListenerContainerFactory<String, CarTelemetryPacket> carTelemetryContainerFactory() {
        return getKafkaListenerContainerFactory(carTelemetryConsumerFactory());
    }

    @Bean
    public ConsumerFactory<String, CarStatusPacket> carStatusConsumerFactory() {
        return getConsumerFactory(CarStatusPacket.class);
    }

    @Bean
    public ConcurrentKafkaListenerContainerFactory<String, CarStatusPacket> carStatusContainerFactory() {
        return getKafkaListenerContainerFactory(carStatusConsumerFactory());
    }

    @Bean
    public ConsumerFactory<String, FinalClassificationPacket> finalClassificationConsumerFactory() {
        return getConsumerFactory(FinalClassificationPacket.class);
    }

    @Bean
    public ConcurrentKafkaListenerContainerFactory<String, FinalClassificationPacket> finalClassificationContainerFactory() {
        return getKafkaListenerContainerFactory(finalClassificationConsumerFactory());
    }

    @Bean
    public ConsumerFactory<String, LobbyInfoPacket> lobbyInfoConsumerFactory() {
        return getConsumerFactory(LobbyInfoPacket.class);
    }

    @Bean
    public ConcurrentKafkaListenerContainerFactory<String, LobbyInfoPacket> lobbyInfoContainerFactory() {
        return getKafkaListenerContainerFactory(lobbyInfoConsumerFactory());
    }

}
