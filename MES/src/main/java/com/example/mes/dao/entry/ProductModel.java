package com.example.mes.dao.entry;

public class ProductModel {
    private int modelID;
    private String modelName;
    private String productName;
    private String productModel;
    private String productSpecs;
    private String productUnit;
    private String remarks;

    public int getModelID() {
        return modelID;
    }

    public void setModelID(int modelID) {
        this.modelID = modelID;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
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

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    @Override
    public String toString() {
        return "ProductModel{" +
                "modelID=" + modelID +
                ", modelName='" + modelName + '\'' +
                ", productName='" + productName + '\'' +
                ", productModel='" + productModel + '\'' +
                ", productSpecs='" + productSpecs + '\'' +
                ", productUnit='" + productUnit + '\'' +
                ", remarks='" + remarks + '\'' +
                '}';
    }
}
