package com.tortilla.f1.telemetry.telemetryproducer.model;

import com.fasterxml.jackson.annotation.JsonAlias;

public class ForecastSample {
    @JsonAlias("m_sessionType")
    private int sessionType;
    @JsonAlias("m_timeOffset")
    private int timeOffset;
    @JsonAlias("m_weather")
    private int weather;
    @JsonAlias("m_trackTemperature")
    private int trackTemperature;
    @JsonAlias("m_airTemperature")
    private int airTemperature;
}
