package com.tortilla.f1.telemetry.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import lombok.Data;

import java.util.List;

@Data
public class SessionPacket {
    @JsonAlias("m_weather")
    private Float weather;
    @JsonAlias("m_trackTemperature")
    private Float trackTemperature;
    @JsonAlias("m_airTemperature")
    private Float airTemperature;
    @JsonAlias("m_totalLaps")
    private Float totalLaps;
    @JsonAlias("m_trackLength")
    private Float trackLength;
    @JsonAlias("m_sessionType")
    private Float sessionType;
    @JsonAlias("m_trackId")
    private Float trackId;
    @JsonAlias("m_formula")
    private Float formula;
    @JsonAlias("m_sessionTimeLeft")
    private Float sessionTimeLeft;
    @JsonAlias("m_sessionDuration")
    private Float sessionDuration;
    @JsonAlias("m_pitSpeedLimit")
    private Float pitSpeedLimit;
    @JsonAlias("m_gamePaused")
    private Float gamePaused;
    @JsonAlias("m_isSpectating")
    private Float isSpectating;
    @JsonAlias("m_spectatorCarIndex")
    private Float spectatorCarIndex;
    @JsonAlias("m_sliProNativeSupport")
    private Float sliProNativeSupport;
    @JsonAlias("m_numMarshalZones")
    private Float numMarshalZones;
    @JsonAlias("m_marshalZones")
    private List<MarshalZones> marshalZones;
    @JsonAlias("m_safetyCarStatus")
    private Float safetyCarStatus;
    @JsonAlias("m_networkGame")
    private Float networkGame;
    @JsonAlias("m_numWeatherForecastSamples")
    private Float numWeatherForecastSamples;
    @JsonAlias("m_weatherForecastSamples")
    private List<ForecastSample> forecastSamples;
}