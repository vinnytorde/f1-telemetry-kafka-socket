package com.tortilla.f1.telemetry.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import lombok.Data;

import java.util.List;

@Data
public class LapDataPacket {
    @JsonAlias("m_header")
    private Headers headers;
    @JsonAlias("m_lapData")
    private List<LapData> lapData;
}
