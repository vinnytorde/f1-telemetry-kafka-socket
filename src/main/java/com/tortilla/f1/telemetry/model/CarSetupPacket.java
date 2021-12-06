package com.tortilla.f1.telemetry.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import lombok.Data;

import java.util.List;

@Data
public class CarSetupPacket {
    @JsonAlias("m_header")
    private Headers headers;
    @JsonAlias("m_carSetups")
    private List<CarSetup> carSetups;
}
