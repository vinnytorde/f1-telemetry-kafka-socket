package com.tortilla.f1.telemetry.telemetryproducer.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import lombok.Data;

@Data
public class Headers {
    @JsonAlias("m_packetFormat")
    private int packetFormat;
    @JsonAlias("m_gameMajorVersion")
    private int gameMajorVersion;
    @JsonAlias("m_gameMinorVersion")
    private int gameMinorVersion;
    @JsonAlias("m_packetVersion")
    private int packetVersion;
    @JsonAlias("m_packetId")
    private int packetId;
    @JsonAlias("m_sessionUID")
    private String sessionUID;
    @JsonAlias("m_sessionTime")
    float sessionTime;
    @JsonAlias("m_frameIdentifier")
    private int frameIdentifier;
    @JsonAlias("m_playerCarIndex")
    private int playerCarIndex;
    @JsonAlias("m_secondaryPlayerCarIndex")
    private int secondaryPlayerCarIndex;
}
