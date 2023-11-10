package com.example.mes.dao.entry;

public class BomManagement {
    private int bomID;
    private String name;
    private String productName;
    private String productModel;
    private String productSpecs;
    private String productUnit;
    private String description;

    public int getBomID() {
        return bomID;
    }

    public void setBomID(int bomID) {
        this.bomID = bomID;
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
        return "BomManagement{" +
                "bomID=" + bomID +
                ", name='" + name + '\'' +
                ", productName='" + productName + '\'' +
                ", productModel='" + productModel + '\'' +
                ", productSpecs='" + productSpecs + '\'' +
                ", productUnit='" + productUnit + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}

