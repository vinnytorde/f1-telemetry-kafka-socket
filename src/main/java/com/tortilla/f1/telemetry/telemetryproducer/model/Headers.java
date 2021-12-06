package com.tortilla.f1.telemetry.telemetryproducer.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import lombok.Data;

@Data
public class Headers {
    @JsonAlias("m_packetFormat")
    private Integer packetFormat; // 2020
    @JsonAlias("m_gameMajorVersion")
    private Integer gameMajorVersion; // Game major version - "X.00"
    @JsonAlias("m_gameMinorVersion")
    private Integer gameMinorVersion; // Game minor version - "1.XX"
    @JsonAlias("m_packetVersion")
    private Integer packetVersion; // Version of this packet type, all start from 1
    @JsonAlias("m_packetId")
    private Integer packetId; // Identifier for the packet type, see below
    @JsonAlias("m_sessionUID")
    private String sessionUID; // Unique identifier for the session
    @JsonAlias("m_sessionTime")
    private Float sessionTime; // Session timestamp
    @JsonAlias("m_frameIdentifier")
    private Integer frameIdentifier; // Identifier for the frame the data was retrieved on
    @JsonAlias("m_playerCarIndex")
    private Integer playerCarIndex; // Index of player's car in the array
    @JsonAlias("m_secondaryPlayerCarIndex")
    private Integer secondaryPlayerCarIndex; // Index of secondary player's car in the array (splitscreen). 255 if no second player
}

