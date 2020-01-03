package com.example.demo.api;

public class OrderProductsResponseInfo {

    protected String orderReference;
    protected String message;

    public String getOrderReference() {
        return orderReference;
    }

    public void setOrderReference(String value) {
        this.orderReference = value;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String value) {
        this.message = value;
    }

}
