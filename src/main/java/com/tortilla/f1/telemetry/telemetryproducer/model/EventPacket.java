package com.tortilla.f1.telemetry.telemetryproducer.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import lombok.Data;

@Data
public class EventPacket {
    @JsonAlias("m_header")
    private Headers headers;
    @JsonAlias("m_eventStringCode")
    private String eventCode;
    @JsonAlias("m_eventDetails")
    private EventDetails details;
}
