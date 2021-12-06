package com.tortilla.f1.telemetry.telemetryproducer.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import lombok.Data;

@Data
public class Headers {
    @JsonAlias("m_packetFormat")
    private Float packetFormat;
    @JsonAlias("m_gameMajorVersion")
    private Float gameMajorVersion;
    @JsonAlias("m_gameMinorVersion")
    private Float gameMinorVersion;
    @JsonAlias("m_packetVersion")
    private Float packetVersion;
    @JsonAlias("m_packetId")
    private Float packetId;
    @JsonAlias("m_sessionUID")
    private String sessionUID;
    @JsonAlias("m_sessionTime")
    float sessionTime;
    @JsonAlias("m_frameIdentifier")
    private Float frameIdentifier;
    @JsonAlias("m_playerCarIndex")
    private Float playerCarIndex;
    @JsonAlias("m_secondaryPlayerCarIndex")
    private Float secondaryPlayerCarIndex;
}
