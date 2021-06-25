package com.example.matrix.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Item {
    @Id
     int itemId;
    @OneToOne
    SubCategory subCatId;
    String productName;
    String purchaseUnits;
    ItemStatus itemStatus;
    ItemTag tag;
    Double unitPurchaseCost;
    Double totalPurchaseCost;
    String description;
    String specification;
    int lowStockLevel;



    public SubCategory getSubCatId() {
        return subCatId;
    }

    public void setSubCatId(SubCategory subCatId) {
        this.subCatId = subCatId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getPurchaseUnits() {
        return purchaseUnits;
    }

    public void setPurchaseUnits(String purchaseUnits) {
        this.purchaseUnits = purchaseUnits;
    }

    public ItemStatus getItemStatus() {
        return itemStatus;
    }

    public void setItemStatus(ItemStatus itemStatus) {
        this.itemStatus = itemStatus;
    }

    public ItemTag getTag() {
        return tag;
    }

    public void setTag(ItemTag tag) {
        this.tag = tag;
    }

    public Double getUnitPurchaseCost() {
        return unitPurchaseCost;
    }

    public void setUnitPurchaseCost(Double unitPurchaseCost) {
        this.unitPurchaseCost = unitPurchaseCost;
    }

    public Double getTotalPurchaseCost() {
        return totalPurchaseCost;
    }

    public void setTotalPurchaseCost(Double totalPurchaseCost) {
        this.totalPurchaseCost = totalPurchaseCost;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSpecification() {
        return specification;
    }

    public void setSpecification(String specification) {
        this.specification = specification;
    }

    public int getLowStockLevel() {
        return lowStockLevel;
    }

    public void setLowStockLevel(int lowStockLevel) {
        this.lowStockLevel = lowStockLevel;
    }
}
