package com.tortilla.f1.telemetry.telemetryproducer.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import lombok.Data;

import java.util.List;

@Data
public class ParticipantsPacket {
    @JsonAlias("m_header")
    private Headers headers;
    @JsonAlias("m_participants")
    private List<Participants> lapData;
    @JsonAlias("m_numActiveCars")
    private Integer numActiveCars;
}
