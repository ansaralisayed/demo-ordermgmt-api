package com.example.demo.api;

import java.util.ArrayList;
import java.util.List;


public class OrderProductsInfo {

    protected String customerId;
    protected List<CartEntryInfo> cartEntries;

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String value) {
        this.customerId = value;
    }

    public List<CartEntryInfo> getCartEntries() {
        if (cartEntries == null) {
            cartEntries = new ArrayList<CartEntryInfo>();
        }
        return this.cartEntries;
    }

}
