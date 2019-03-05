package com.company.sales.entity;

import com.haulmont.chile.core.datatypes.impl.EnumClass;

import javax.annotation.Nullable;


public enum ShopType implements EnumClass<Integer> {

    SUPER(10),
    MINI(20);

    private Integer id;

    ShopType(Integer value) {
        this.id = value;
    }

    public Integer getId() {
        return id;
    }

    @Nullable
    public static ShopType fromId(Integer id) {
        for (ShopType at : ShopType.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}