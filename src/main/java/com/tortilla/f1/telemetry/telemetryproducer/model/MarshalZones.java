package com.tortilla.f1.telemetry.telemetryproducer.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import lombok.Data;

@Data
public class MarshalZones {
    @JsonAlias("m_zoneStart")
    private float zoneStart;
    @JsonAlias("m_zoneFlag")
    private float zoneFlag;
}
