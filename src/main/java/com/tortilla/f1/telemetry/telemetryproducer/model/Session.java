package com.tortilla.f1.telemetry.telemetryproducer.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import lombok.Data;

import java.util.List;

@Data
public class Session {
    @JsonAlias("m_weather")
    private int weather;
    @JsonAlias("m_trackTemperature")
    private int trackTemperature;
    @JsonAlias("m_airTemperature")
    private int airTemperature;
    @JsonAlias("m_totalLaps")
    private int totalLaps;
    @JsonAlias("m_trackLength")
    private int trackLength;
    @JsonAlias("m_sessionType")
    private int sessionType;
    @JsonAlias("m_trackId")
    private int trackId;
    @JsonAlias("m_formula")
    private int formula;
    @JsonAlias("m_sessionTimeLeft")
    private int sessionTimeLeft;
    @JsonAlias("m_sessionDuration")
    private int sessionDuration;
    @JsonAlias("m_pitSpeedLimit")
    private int pitSpeedLimit;
    @JsonAlias("m_gamePaused")
    private int gamePaused;
    @JsonAlias("m_isSpectating")
    private int isSpectating;
    @JsonAlias("m_spectatorCarIndex")
    private int spectatorCarIndex;
    @JsonAlias("m_sliProNativeSupport")
    private int sliProNativeSupport;
    @JsonAlias("m_numMarshalZones")
    private int numMarshalZones;
    @JsonAlias("m_marshalZones")
    private List<MarshalZones> marshalZones;
    @JsonAlias("m_safetyCarStatus")
    private int safetyCarStatus;
    @JsonAlias("m_networkGame")
    private int networkGame;
    @JsonAlias("m_numWeatherForecastSamples")
    private int numWeatherForecastSamples;
    @JsonAlias("m_weatherForecastSamples")
    private List<ForecastSample> forecastSamples;
}