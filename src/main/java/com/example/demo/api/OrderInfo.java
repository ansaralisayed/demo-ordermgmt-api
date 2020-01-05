package com.example.demo.api;

import java.util.ArrayList;
import java.util.List;


public class OrderInfo {

    protected String customerId;
//    protected OrderStatus orderStatus;
    protected String refNum;
    protected List<CartEntryInfo> cartEntries;

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String value) {
        this.customerId = value;
    }

//    public OrderStatus getOrderStatus() {
//        return orderStatus;
//    }
//
//    public void setOrderStatus(OrderStatus value) {
//        this.orderStatus = value;
//    }

    public String getRefNum() {
        return refNum;
    }

    public void setRefNum(String value) {
        this.refNum = value;
    }

    public List<CartEntryInfo> getCartEntries() {
        if (cartEntries == null) {
            cartEntries = new ArrayList<CartEntryInfo>();
        }
        return this.cartEntries;
    }

}
