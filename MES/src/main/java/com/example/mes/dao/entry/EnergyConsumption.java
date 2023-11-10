package com.example.mes.dao.entry;

import java.util.Date;

public class EnergyConsumption {
    private int consumptionID;
    private Integer equipmentID;
    private Integer productionQuantity;
    private Double unitPowerConsumption;
    private Double totalPowerConsumption;
    private Double unitCarbonEmission;
    private Double totalCarbonEmission;
    private Date date;

    public int getConsumptionID() {
        return consumptionID;
    }

    public void setConsumptionID(int consumptionID) {
        this.consumptionID = consumptionID;
    }

    public Integer getEquipmentID() {
        return equipmentID;
    }

    public void setEquipmentID(Integer equipmentID) {
        this.equipmentID = equipmentID;
    }

    public Integer getProductionQuantity() {
        return productionQuantity;
    }

    public void setProductionQuantity(Integer productionQuantity) {
        this.productionQuantity = productionQuantity;
    }

    public Double getUnitPowerConsumption() {
        return unitPowerConsumption;
    }

    public void setUnitPowerConsumption(Double unitPowerConsumption) {
        this.unitPowerConsumption = unitPowerConsumption;
    }

    public Double getTotalPowerConsumption() {
        return totalPowerConsumption;
    }

    public void setTotalPowerConsumption(Double totalPowerConsumption) {
        this.totalPowerConsumption = totalPowerConsumption;
    }

    public Double getUnitCarbonEmission() {
        return unitCarbonEmission;
    }

    public void setUnitCarbonEmission(Double unitCarbonEmission) {
        this.unitCarbonEmission = unitCarbonEmission;
    }

    public Double getTotalCarbonEmission() {
        return totalCarbonEmission;
    }

    public void setTotalCarbonEmission(Double totalCarbonEmission) {
        this.totalCarbonEmission = totalCarbonEmission;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "EnergyConsumption{" +
                "consumptionID=" + consumptionID +
                ", equipmentID=" + equipmentID +
                ", productionQuantity=" + productionQuantity +
                ", unitPowerConsumption=" + unitPowerConsumption +
                ", totalPowerConsumption=" + totalPowerConsumption +
                ", unitCarbonEmission=" + unitCarbonEmission +
                ", totalCarbonEmission=" + totalCarbonEmission +
                ", date=" + date +
                '}';
    }
}

