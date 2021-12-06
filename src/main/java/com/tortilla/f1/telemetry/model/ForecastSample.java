package com.tortilla.f1.telemetry.model;

import com.fasterxml.jackson.annotation.JsonAlias;

public class ForecastSample {
    @JsonAlias("m_sessionType")
    private Float sessionType;
    @JsonAlias("m_timeOffset")
    private Float timeOffset;
    @JsonAlias("m_weather")
    private Float weather;
    @JsonAlias("m_trackTemperature")
    private Float trackTemperature;
    @JsonAlias("m_airTemperature")
    private Float airTemperature;
}
