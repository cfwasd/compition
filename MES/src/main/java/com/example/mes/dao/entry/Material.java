package com.example.mes.dao.entry;

public class Material {
    private int materialID;
    private String materialCode;
    private String materialName;
    private String materialModel;
    private String materialSpecs;
    private String materialUnit;
    private Double materialPrice;
    private String materialType;
    private String remarks;

    public int getMaterialID() {
        return materialID;
    }

    public void setMaterialID(int materialID) {
        this.materialID = materialID;
    }

    public String getMaterialCode() {
        return materialCode;
    }

    public void setMaterialCode(String materialCode) {
        this.materialCode = materialCode;
    }

    public String getMaterialName() {
        return materialName;
    }

    public void setMaterialName(String materialName) {
        this.materialName = materialName;
    }

    public String getMaterialModel() {
        return materialModel;
    }

    public void setMaterialModel(String materialModel) {
        this.materialModel = materialModel;
    }

    public String getMaterialSpecs() {
        return materialSpecs;
    }

    public void setMaterialSpecs(String materialSpecs) {
        this.materialSpecs = materialSpecs;
    }

    public String getMaterialUnit() {
        return materialUnit;
    }

    public void setMaterialUnit(String materialUnit) {
        this.materialUnit = materialUnit;
    }

    public Double getMaterialPrice() {
        return materialPrice;
    }

    public void setMaterialPrice(Double materialPrice) {
        this.materialPrice = materialPrice;
    }

    public String getMaterialType() {
        return materialType;
    }

    public void setMaterialType(String materialType) {
        this.materialType = materialType;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    @Override
    public String toString() {
        return "Material{" +
                "materialID=" + materialID +
                ", materialCode='" + materialCode + '\'' +
                ", materialName='" + materialName + '\'' +
                ", materialModel='" + materialModel + '\'' +
                ", materialSpecs='" + materialSpecs + '\'' +
                ", materialUnit='" + materialUnit + '\'' +
                ", materialPrice=" + materialPrice +
                ", materialType='" + materialType + '\'' +
                ", remarks='" + remarks + '\'' +
                '}';
    }
}
