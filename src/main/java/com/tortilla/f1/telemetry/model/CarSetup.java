package com.tortilla.f1.telemetry.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import lombok.Data;

@Data
public class CarSetup {
    @JsonAlias("m_frontWing")
    private Integer frontWing;
    @JsonAlias("m_rearWing")
    private Integer rearWing;
    @JsonAlias("m_onThrottle")
    private Integer onThrottle;
    @JsonAlias("m_offThrottle")
    private Integer offThrottle;
    @JsonAlias("m_frontCamber")
    private Float frontCamber;
    @JsonAlias("m_rearCamber")
    private Float rearCamber;
    @JsonAlias("m_frontToe")
    private Float frontToe;
    @JsonAlias("m_rearToe")
    private Float rearToe;
    @JsonAlias("m_frontSuspension")
    private Integer frontSuspension;
    @JsonAlias("m_rearSuspension")
    private Integer rearSuspension;
    @JsonAlias("m_frontAntiRollBar")
    private Integer frontAntiRollBar;
    @JsonAlias("m_rearAntiRollBar")
    private Integer rearAntiRollBar;
    @JsonAlias("m_frontSuspensionHeight")
    private Integer frontSuspensionHeight;
    @JsonAlias("m_rearSuspensionHeight")
    private Integer rearSuspensionHeight;
    @JsonAlias("m_brakePressure")
    private Integer brakePressure;
    @JsonAlias("m_brakeBias")
    private Integer brakeBias;
    @JsonAlias("m_frontTyrePressure")
    private Float frontTyrePressure;
    @JsonAlias("m_rearTyrePressure")
    private Float rearTyrePressure;
    @JsonAlias("m_ballast")
    private Integer ballast;
    @JsonAlias("m_fuelLoad")
    private Float fuelLoad;
}
