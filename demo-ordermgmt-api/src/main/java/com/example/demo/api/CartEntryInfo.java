package com.example.demo.api;

import com.example.demo.api.ProductInfo;


public class CartEntryInfo {

    protected ProductInfo product;
    protected int quantity;

    public ProductInfo getProduct() {
        return product;
    }

    public void setProduct(ProductInfo value) {
        this.product = value;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int value) {
        this.quantity = value;
    }

}
