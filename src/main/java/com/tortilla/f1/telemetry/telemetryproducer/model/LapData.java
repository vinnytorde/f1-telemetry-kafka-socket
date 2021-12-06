package com.tortilla.f1.telemetry.telemetryproducer.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import lombok.Data;

@Data
public class LapData {
    @JsonAlias("m_lastLapTime")
    private Float lastLapTime;
    @JsonAlias("m_currentLapTime")
    private Float currentLapTime;
    @JsonAlias("m_sector1TimeInMS")
    private Float sector1TimeInMS;
    @JsonAlias("m_sector2TimeInMS")
    private Float sector2TimeInMS;
    @JsonAlias("m_bestLapTime")
    private Float bestLapTime;
    @JsonAlias("m_bestLapNum")
    private Float bestLapNum;
    @JsonAlias("m_bestLapSector1TimeInMS")
    private Float bestLapSector1TimeInMS;
    @JsonAlias("m_bestLapSector2TimeInMS")
    private Float bestLapSector2TimeInMS;
    @JsonAlias("m_bestLapSector3TimeInMS")
    private Float bestLapSector3TimeInMS;
    @JsonAlias("m_bestOverallSector1TimeInMS")
    private Float bestOverallSector1TimeInMS;
    @JsonAlias("m_bestOverallSector1LapNum")
    private Float bestOverallSector1LapNum;
    @JsonAlias("m_bestOverallSector2TimeInMS")
    private Float bestOverallSector2TimeInMS;
    @JsonAlias("m_bestOverallSector2LapNum")
    private Float bestOverallSector2LapNum;
    @JsonAlias("m_bestOverallSector3TimeInMS")
    private Float bestOverallSector3TimeInMS;
    @JsonAlias("m_bestOverallSector3LapNum")
    private Float bestOverallSector3LapNum;
    @JsonAlias("m_lapDistance")
    private Float lapDistance;
    @JsonAlias("m_totalDistance")
    private Float totalDistance;
    @JsonAlias("m_safetyCarDelta")
    private Float safetyCarDelta;
    @JsonAlias("m_carPosition")
    private Float carPosition;
    @JsonAlias("m_currentLapNum")
    private Float currentLapNum;
    @JsonAlias("m_pitStatus")
    private Float pitStatus;
    @JsonAlias("m_sector")
    private Float sector;
    @JsonAlias("m_currentLapInvalid")
    private Float currentLapInvalid;
    @JsonAlias("m_penalties")
    private Float penalties;
    @JsonAlias("m_gridPosition")
    private Float gridPosition;
    @JsonAlias("m_driverStatus")
    private Float driverStatus;
    @JsonAlias("m_resultStatus")
    private Float resultStatus;
}
