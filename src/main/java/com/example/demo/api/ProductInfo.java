package com.example.demo.api;

import com.example.demo.api.CategoryInfo;

public class ProductInfo {

    protected String id;
    protected String name;
    protected int year;
    protected CategoryInfo category;

    public String getId() {
        return id;
    }

    public void setId(String value) {
        this.id = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String value) {
        this.name = value;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int value) {
        this.year = value;
    }

    public CategoryInfo getCategory() {
        return category;
    }

    public void setCategory(CategoryInfo value) {
        this.category = value;
    }

}
