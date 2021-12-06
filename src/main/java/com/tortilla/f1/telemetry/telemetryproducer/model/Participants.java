package com.tortilla.f1.telemetry.telemetryproducer.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import lombok.Data;

@Data
public class Participants {
    @JsonAlias("m_aiControlled")
    private Integer aiControlled;
    @JsonAlias("m_driverId")
    private Integer driverId;
    @JsonAlias("m_teamId")
    private Integer teamId;
    @JsonAlias("m_raceNumber")
    private Integer raceNumber;
    @JsonAlias("m_nationality")
    private Integer nationality;
    @JsonAlias("m_name")
    private String name;
    @JsonAlias("m_yourTelemetry")
    private Integer yourTelemetry;
}
