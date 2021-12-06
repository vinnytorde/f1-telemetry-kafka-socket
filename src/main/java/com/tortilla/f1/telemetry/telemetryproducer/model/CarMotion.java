package com.tortilla.f1.telemetry.telemetryproducer.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import lombok.Data;

@Data
public class CarMotion {
    @JsonAlias("m_worldPositionX")
    private Float worldPositionX;
    @JsonAlias("m_worldPositionY")
    private Float worldPositionY;
    @JsonAlias("m_worldPositionZ")
    private Float worldPositionZ;
    @JsonAlias("m_worldVelocityX")
    private Float worldVelocityX;
    @JsonAlias("m_worldVelocityY")
    private Float worldVelocityY;
    @JsonAlias("m_worldVelocityZ")
    private Float worldVelocityZ;
    @JsonAlias("m_worldForwardDirX")
    private Float worldForwardDirX;
    @JsonAlias("m_worldForwardDirY")
    private Float worldForwardDirY;
    @JsonAlias("m_worldForwardDirZ")
    private Float worldForwardDirZ;
    @JsonAlias("m_worldRightDirX")
    private Float worldRightDirX;
    @JsonAlias("m_worldRightDirY")
    private Float worldRightDirY;
    @JsonAlias("m_worldRightDirZ")
    private Float worldRightDirZ;
    @JsonAlias("m_gForceLateral")
    private Float gForceLateral;
    @JsonAlias("m_gForceLongitudinal")
    private Float gForceLongitudinal;
    @JsonAlias("m_gForceVertical")
    private Float gForceVertical;
    @JsonAlias("m_yaw")
    private Float yaw;
    @JsonAlias("m_pitch")
    private Float pitch;
    @JsonAlias("m_roll")
    private Float roll;
}
