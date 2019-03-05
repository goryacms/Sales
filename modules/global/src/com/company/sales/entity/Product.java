package com.company.sales.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.math.BigDecimal;
import javax.persistence.Column;
import javax.validation.constraints.NotNull;
import com.haulmont.cuba.core.entity.StandardEntity;
import javax.persistence.UniqueConstraint;
import com.haulmont.chile.core.annotations.NamePattern;

@NamePattern("%s|name")
@Table(name = "SALES_PRODUCT", uniqueConstraints = {
    @UniqueConstraint(name = "IDX_SALES_PRODUCT_UNQ", columnNames = {"NAME", "PRICE"})
})
@Entity(name = "sales$Product")
public class Product extends StandardEntity {
    private static final long serialVersionUID = 5105411368661134386L;

    @NotNull
    @Column(name = "NAME", nullable = false, length = 150)
    protected String name;

    @NotNull
    @Column(name = "PRICE", nullable = false)
    protected BigDecimal price;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getPrice() {
        return price;
    }


}