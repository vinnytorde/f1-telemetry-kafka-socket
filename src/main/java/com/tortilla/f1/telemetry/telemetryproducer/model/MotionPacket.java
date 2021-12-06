package com.tortilla.f1.telemetry.telemetryproducer.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import lombok.Data;

import java.util.List;

@Data
public class MotionPacket {
    @JsonAlias("m_header")
    private Headers headers;
    @JsonAlias("m_carMotionData")
    private List<CarMotion> carMotion;
    @JsonAlias("m_suspensionPosition")
    private List<Float> suspensionPosition;
    @JsonAlias("m_suspensionVelocity")
    private List<Float> suspensionVelocity;
    @JsonAlias("m_suspensionAcceleration")
    private List<Float> suspensionAcceleration;
    @JsonAlias("m_wheelSpeed")
    private List<Float> wheelSpeed;
    @JsonAlias("m_wheelSlip")
    private List<Float> wheelSlip;
    @JsonAlias("m_localVelocityX")
    private Float localVelocityX;
    @JsonAlias("m_localVelocityY")
    private Float localVelocityY;
    @JsonAlias("m_localVelocityZ")
    private Float localVelocityZ;
    @JsonAlias("m_angularVelocityX")
    private Float angularVelocityX;
    @JsonAlias("m_angularVelocityY")
    private Float angularVelocityY;
    @JsonAlias("m_angularVelocityZ")
    private Float angularVelocityZ;
    @JsonAlias("m_angularAccelerationX")
    private Float angularAccelerationX;
    @JsonAlias("m_angularAccelerationY")
    private Float angularAccelerationY;
    @JsonAlias("m_angularAccelerationZ")
    private Float angularAccelerationZ;
    @JsonAlias("m_frontWheelsAngle")
    private Float frontWheelsAngle;
}
