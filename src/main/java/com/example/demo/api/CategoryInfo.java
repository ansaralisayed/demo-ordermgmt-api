package com.example.demo.api;

public enum CategoryInfo {

    DOMESTIC,
    INTERNATIONAL;

    public String value() {
        return name();
    }

    public static CategoryInfo fromValue(String v) {
        return valueOf(v);
    }

//	public static Category getByCode(String code) {
//		return Stream.of(Category.values()).filter(e -> code.equals(e.value())).findFirst().orElse(DOMESTIC);
//	}

}
