package com.example.mes.dao.entry;

public class ProductModelDetail {
    private int detailID;
    private Integer modelID;
    private Integer materialID;
    private String materialModel;
    private String materialSpecs;
    private String materialUnit;
    private String remarks;

    public int getDetailID() {
        return detailID;
    }

    public void setDetailID(int detailID) {
        this.detailID = detailID;
    }

    public Integer getModelID() {
        return modelID;
    }

    public void setModelID(Integer modelID) {
        this.modelID = modelID;
    }

    public Integer getMaterialID() {
        return materialID;
    }

    public void setMaterialID(Integer materialID) {
        this.materialID = materialID;
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

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    @Override
    public String toString() {
        return "ProductModelDetail{" +
                "detailID=" + detailID +
                ", modelID=" + modelID +
                ", materialID=" + materialID +
                ", materialModel='" + materialModel + '\'' +
                ", materialSpecs='" + materialSpecs + '\'' +
                ", materialUnit='" + materialUnit + '\'' +
                ", remarks='" + remarks + '\'' +
                '}';
    }
}
