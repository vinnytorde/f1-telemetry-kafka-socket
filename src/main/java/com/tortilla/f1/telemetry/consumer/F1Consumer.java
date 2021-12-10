package com.tortilla.f1.telemetry.consumer;

import com.tortilla.f1.telemetry.model.*;
import com.tortilla.f1.telemetry.util.TopicConstants;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;

@Controller
@RequiredArgsConstructor
public class F1Consumer implements TopicConstants {

    private final SimpMessagingTemplate template;

    private String slash(String topic) {
        return "/" + topic;
    }

    @KafkaListener(topics = session, groupId = "telemetry-producer-session", containerFactory = "sessionContainerFactory")
    public void listenSessionTelemetry(SessionPacket message) {
        template.convertAndSend(slash(session), message);
    }

    @KafkaListener(topics = motion, groupId = "telemetry-producer-motion", containerFactory = "motionContainerFactory")
    public void listenMotion(MotionPacket message) {
        template.convertAndSend(slash(motion), message);
    }

    @KafkaListener(topics = lapData, groupId = "telemetry-producer", containerFactory = "lapDataContainerFactory")
    public void listenLapData(LapDataPacket message) {
        template.convertAndSend(slash(lapData), message);
    }

    @KafkaListener(topics = event, groupId = "telemetry-producer", containerFactory = "eventContainerFactory")
    public void listenEvent(EventPacket message) {
        template.convertAndSend(slash(event), message);
    }

    @KafkaListener(topics = participants, groupId = "telemetry-producer", containerFactory = "participantsContainerFactory")
    public void listenParticipants(ParticipantsPacket message) {
        template.convertAndSend(slash(participants), message);
    }

    @KafkaListener(topics = carSetups, groupId = "telemetry-producer", containerFactory = "carSetupsContainerFactory")
    public void listenCarSetups(CarSetupPacket message) {
        template.convertAndSend(slash(carSetups), message);
    }

    @KafkaListener(topics = carTelemetry, groupId = "telemetry-producer", containerFactory = "carTelemetryContainerFactory")
    public void listenCarTelemetry(CarTelemetryPacket message) {
        template.convertAndSend(slash(carTelemetry), message);
    }

    @KafkaListener(topics = carStatus, groupId = "telemetry-producer", containerFactory = "carStatusContainerFactory")
    public void listenCarStatus(CarStatusPacket message) {
        template.convertAndSend(slash(carStatus), message);
    }

    @KafkaListener(topics = finalClassification, groupId = "telemetry-producer", containerFactory = "finalClassificationContainerFactory")
    public void listenFinalClassification(FinalClassificationPacket message) {
        template.convertAndSend(slash(finalClassification), message);
    }

    @KafkaListener(topics = lobbyInfo, groupId = "telemetry-producer", containerFactory = "lobbyInfoContainerFactory")
    public void listenLobbyInfo(LobbyInfoPacket message) {
        template.convertAndSend(slash(lobbyInfo), message);
    }
}