package com.tortilla.f1.telemetry.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import lombok.Data;

import java.util.List;

@Data
public class CarStatusPacket {
    @JsonAlias("m_header")
    private Headers headers;
    @JsonAlias("m_carStatusData")
    private List<CarStatus> carStatusData;
}
