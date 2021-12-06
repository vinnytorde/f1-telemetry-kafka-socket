package com.tortilla.f1.telemetry.telemetryproducer.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import lombok.Data;

import java.util.List;

@Data
public class Telemetry {
    @JsonAlias("m_speed")
    private Float speed;
    @JsonAlias("m_throttle")
    private Integer throttle;
    @JsonAlias("m_steer")
    private Integer steer;
    @JsonAlias("m_brake")
    private Integer brake;
    @JsonAlias("m_clutch")
    private Integer clutch;
    @JsonAlias("m_gear")
    private Integer gear;
    @JsonAlias("m_engineRPM")
    private Integer engineRPM;
    @JsonAlias("m_drs")
    private Integer drs;
    @JsonAlias("m_revLightsPercent")
    private Integer revLightsPercent;
    @JsonAlias("m_brakesTemperature")
    private List<Float> brakesTemperature;
    @JsonAlias("m_tyresSurfaceTemperature")
    private List<Float> tyresSurfaceTemperature;
    @JsonAlias("m_tyresInnerTemperature")
    private List<Float> tyresInnerTemperature;
    @JsonAlias("m_engineTemperature")
    private Float engineTemperature;
    @JsonAlias("m_tyresPressure")
    private List<Float> tyresPressure;
    @JsonAlias("m_surfaceType")
    private List<Integer> surfaceType;
}
