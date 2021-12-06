package com.tortilla.f1.telemetry.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import lombok.Data;

import java.util.List;

@Data
public class CarStatus {
    @JsonAlias("m_tractionControl")
    private Integer tractionControl;
    @JsonAlias("m_antiLockBrakes")
    private Integer antiLockBrakes;
    @JsonAlias("m_fuelMix")
    private Integer fuelMix;
    @JsonAlias("m_frontBrakeBias")
    private Integer frontBrakeBias;
    @JsonAlias("m_pitLimiterStatus")
    private Integer pitLimiterStatus;
    @JsonAlias("m_fuelInTank")
    private Integer fuelInTank;
    @JsonAlias("m_fuelCapacity")
    private Integer fuelCapacity;
    @JsonAlias("m_fuelRemainingLaps")
    private Float fuelRemainingLaps;
    @JsonAlias("m_maxRPM")
    private Integer maxRPM;
    @JsonAlias("m_idleRPM")
    private Integer idleRPM;
    @JsonAlias("m_maxGears")
    private Integer maxGears;
    @JsonAlias("m_drsAllowed")
    private Integer drsAllowed;
    @JsonAlias("m_drsActivationDistance")
    private Integer drsActivationDistance;
    @JsonAlias("m_tyresWear")
    private List<Integer> tyresWear;
    @JsonAlias("m_actualTyreCompound")
    private Integer actualTyreCompound;
    @JsonAlias("m_tyreVisualCompound")
    private Integer tyreVisualCompound;
    @JsonAlias("m_tyresAgeLaps")
    private Integer tyresAgeLaps;
    @JsonAlias("m_tyresDamage")
    private List<Integer> tyresDamage;
    @JsonAlias("m_frontLeftWingDamage")
    private Integer frontLeftWingDamage;
    @JsonAlias("m_frontRightWingDamage")
    private Integer frontRightWingDamage;
    @JsonAlias("m_rearWingDamage")
    private Integer rearWingDamage;
    @JsonAlias("m_drsFault")
    private Integer drsFault;
    @JsonAlias("m_engineDamage")
    private Integer engineDamage;
    @JsonAlias("m_gearBoxDamage")
    private Integer gearBoxDamage;
    @JsonAlias("m_vehicleFiaFlags")
    private Integer vehicleFiaFlags;
    @JsonAlias("m_ersStoreEnergy")
    private Integer ersStoreEnergy;
    @JsonAlias("m_ersDeployMode")
    private Integer ersDeployMode;
    @JsonAlias("m_ersHarvestedThisLapMGUK")
    private Integer ersHarvestedThisLapMGUK;
    @JsonAlias("m_ersHarvestedThisLapMGUH")
    private Integer ersHarvestedThisLapMGUH;
    @JsonAlias("m_ersDeployedThisLap")
    private Integer ersDeployedThisLap;
}
