package com.example.mes.dao.entry;

import java.util.Date;

public class BomChangelog {
    private int logID;
    private Integer bomID;
    private String modifiedBy;
    private Date modifiedDate;
    private String name;
    private String productName;
    private String productModel;
    private String productSpecs;
    private String productUnit;
    private String description;

    public int getLogID() {
        return logID;
    }

    public void setLogID(int logID) {
        this.logID = logID;
    }

    public Integer getBomID() {
        return bomID;
    }

    public void setBomID(Integer bomID) {
        this.bomID = bomID;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductModel() {
        return productModel;
    }

    public void setProductModel(String productModel) {
        this.productModel = productModel;
    }

    public String getProductSpecs() {
        return productSpecs;
    }

    public void setProductSpecs(String productSpecs) {
        this.productSpecs = productSpecs;
    }

    public String getProductUnit() {
        return productUnit;
    }

    public void setProductUnit(String productUnit) {
        this.productUnit = productUnit;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "BomChangelog{" +
                "logID=" + logID +
                ", bomID=" + bomID +
                ", modifiedBy='" + modifiedBy + '\'' +
                ", modifiedDate=" + modifiedDate +
                ", name='" + name + '\'' +
                ", productName='" + productName + '\'' +
                ", productModel='" + productModel + '\'' +
                ", productSpecs='" + productSpecs + '\'' +
                ", productUnit='" + productUnit + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
