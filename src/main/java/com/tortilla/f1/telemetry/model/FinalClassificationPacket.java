package com.tortilla.f1.telemetry.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import lombok.Data;

import java.util.List;

@Data
public class FinalClassificationPacket {
    @JsonAlias("m_header")
    private Headers headers;
    @JsonAlias("m_eventStringCode")
    private List<Object> eventCode;
}
