package com.tortilla.f1.telemetry.kafka.consumer;

import com.tortilla.f1.telemetry.model.*;
import com.tortilla.f1.telemetry.telemetryproducer.model.*;
import com.tortilla.f1.telemetry.util.TopicsConstants;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class F1Consumer implements TopicsConstants {

    @KafkaListener(topics = session, groupId = "telemetry-producer-session")
    public void listenSessionTelemetry(SessionPacket message) {
        System.out.println("message from session listener");
    }

    @KafkaListener(topics = motion, groupId = "telemetry-producer-motion", containerFactory = "motionContainerFactory")
    public void listenMotion(MotionPacket message) {
        System.out.println("message from motion listener");
    }

    @KafkaListener(topics = lapData, groupId = "telemetry-producer", containerFactory = "lapDataContainerFactory")
    public void listenLapData(LapDataPacket message) {
        System.out.println("message from lapData listener");
    }

    @KafkaListener(topics = event, groupId = "telemetry-producer", containerFactory = "eventContainerFactory")
    public void listenEvent(EventPacket message) {
        System.out.println("message from event listener");
    }

    @KafkaListener(topics = participants, groupId = "telemetry-producer", containerFactory = "participantsContainerFactory")
    public void listenParticipants(ParticipantsPacket message) {
        System.out.println("message from participants listener");
    }

    @KafkaListener(topics = carSetups, groupId = "telemetry-producer", containerFactory = "carSetupsContainerFactory")
    public void listenCarSetups(CarSetupPacket message) {
        System.out.println("message from carSetups listener");
    }

    @KafkaListener(topics = carTelemetry, groupId = "telemetry-producer", containerFactory = "carTelemetryContainerFactory")
    public void listenCarTelemetry(CarTelemetryPacket message) {
        System.out.println("message from carTelemetry listener");
    }

    @KafkaListener(topics = carStatus, groupId = "telemetry-producer", containerFactory = "carStatusContainerFactory")
    public void listenCarStatus(CarStatusPacket message) {
        System.out.println("message from carStatus listener");
    }

    @KafkaListener(topics = finalClassification, groupId = "telemetry-producer", containerFactory = "finalClassificationContainerFactory")
    public void listenFinalClassification(FinalClassificationPacket message) {
        System.out.println("message from finalClassification listener");
    }

    @KafkaListener(topics = lobbyInfo, groupId = "telemetry-producer", containerFactory = "lobbyInfoContainerFactory")
    public void listenLobbyInfo(LobbyInfoPacket message) {
        System.out.println("message from lobbyInfo listener");
    }
}