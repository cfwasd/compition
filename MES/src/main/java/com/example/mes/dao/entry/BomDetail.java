package com.example.mes.dao.entry;

public class BomDetail {
    private int detailID;
    private Integer bomID;
    private Integer materialID;
    private String materialModel;
    private String materialSpecs;
    private String materialUnit;
    private Integer quantity;
    private String remarks;

    public int getDetailID() {
        return detailID;
    }

    public void setDetailID(int detailID) {
        this.detailID = detailID;
    }

    public Integer getBomID() {
        return bomID;
    }

    public void setBomID(Integer bomID) {
        this.bomID = bomID;
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

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    @Override
    public String toString() {
        return "BomDetail{" +
                "detailID=" + detailID +
                ", bomID=" + bomID +
                ", materialID=" + materialID +
                ", materialModel='" + materialModel + '\'' +
                ", materialSpecs='" + materialSpecs + '\'' +
                ", materialUnit='" + materialUnit + '\'' +
                ", quantity=" + quantity +
                ", remarks='" + remarks + '\'' +
                '}';
    }
}
