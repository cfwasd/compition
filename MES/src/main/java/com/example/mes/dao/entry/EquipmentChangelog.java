package com.example.mes.dao.entry;

import java.util.Date;

public class EquipmentChangelog {
    private int logID;
    private Integer equipmentID;
    private String modifiedBy;
    private Date modifiedDate;
    private String equipmentName;
    private String equipmentCode;
    private String equipmentModel;
    private Date productionDate;
    private String productionBatch;
    private String manufacturer;
    private EquipmentStatus equipmentStatus;
    private String remarks;

    public int getLogID() {
        return logID;
    }

    public void setLogID(int logID) {
        this.logID = logID;
    }

    public Integer getEquipmentID() {
        return equipmentID;
    }

    public void setEquipmentID(Integer equipmentID) {
        this.equipmentID = equipmentID;
    }

    public String getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    public Date getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public String getEquipmentName() {
        return equipmentName;
    }

    public void setEquipmentName(String equipmentName) {
        this.equipmentName = equipmentName;
    }

    public String getEquipmentCode() {
        return equipmentCode;
    }

    public void setEquipmentCode(String equipmentCode) {
        this.equipmentCode = equipmentCode;
    }

    public String getEquipmentModel() {
        return equipmentModel;
    }

    public void setEquipmentModel(String equipmentModel) {
        this.equipmentModel = equipmentModel;
    }

    public Date getProductionDate() {
        return productionDate;
    }

    public void setProductionDate(Date productionDate) {
        this.productionDate = productionDate;
    }

    public String getProductionBatch() {
        return productionBatch;
    }

    public void setProductionBatch(String productionBatch) {
        this.productionBatch = productionBatch;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public EquipmentStatus getEquipmentStatus() {
        return equipmentStatus;
    }

    public void setEquipmentStatus(EquipmentStatus equipmentStatus) {
        this.equipmentStatus = equipmentStatus;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    @Override
    public String toString() {
        return "EquipmentChangelog{" +
                "logID=" + logID +
                ", equipmentID=" + equipmentID +
                ", modifiedBy='" + modifiedBy + '\'' +
                ", modifiedDate=" + modifiedDate +
                ", equipmentName='" + equipmentName + '\'' +
                ", equipmentCode='" + equipmentCode + '\'' +
                ", equipmentModel='" + equipmentModel + '\'' +
                ", productionDate=" + productionDate +
                ", productionBatch='" + productionBatch + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", equipmentStatus=" + equipmentStatus +
                ", remarks='" + remarks + '\'' +
                '}';
    }
}
