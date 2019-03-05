package com.company.sales.entity;

import javax.persistence.Embeddable;
import com.haulmont.chile.core.annotations.MetaClass;
import com.haulmont.cuba.core.entity.EmbeddableEntity;
import javax.persistence.Column;
import com.haulmont.chile.core.annotations.NamePattern;

@NamePattern("%s|city")
@MetaClass(name = "sales$Address")
@Embeddable
public class Address extends EmbeddableEntity {
    private static final long serialVersionUID = 435719786068836143L;

    @Column(name = "CITY", length = 50)
    protected String city;

    @Column(name = "STREET", length = 50)
    protected String street;

    @Column(name = "HOUSE_NUMBER", length = 10)
    protected String houseNumber;

    public void setCity(String city) {
        this.city = city;
    }

    public String getCity() {
        return city;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getStreet() {
        return street;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getHouseNumber() {
        return houseNumber;
    }


}