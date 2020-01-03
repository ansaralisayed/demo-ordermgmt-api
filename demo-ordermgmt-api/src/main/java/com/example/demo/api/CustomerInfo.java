package com.example.demo.api;

import com.example.demo.api.CategoryInfo;


public class CustomerInfo {

    protected String id;
    protected String name;
    protected int age;
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

    public int getAge() {
        return age;
    }

    public void setAge(int value) {
        this.age = value;
    }

    public CategoryInfo getCategory() {
        return category;
    }

    public void setCategory(CategoryInfo value) {
        this.category = value;
    }

}
