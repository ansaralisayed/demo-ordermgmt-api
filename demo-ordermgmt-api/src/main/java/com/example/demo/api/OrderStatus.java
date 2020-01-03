package com.example.demo.api;


public enum OrderStatus {

    CREATED,
    FULFILLED;

    public String value() {
        return name();
    }

    public static OrderStatus fromValue(String v) {
        return valueOf(v);
    }

}
