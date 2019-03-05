package com.company.sales.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import com.haulmont.cuba.core.entity.annotation.EmbeddedParameters;
import com.haulmont.cuba.core.entity.annotation.OnDelete;
import com.haulmont.cuba.core.entity.annotation.OnDeleteInverse;
import com.haulmont.cuba.core.global.DeletePolicy;
import java.util.Set;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.chile.core.annotations.NamePattern;

@NamePattern("%s|shopType")
@Table(name = "SALES_SHOP")
@Entity(name = "sales$Shop")
public class Shop extends StandardEntity {
    private static final long serialVersionUID = -242258580046313964L;

    @Embedded
    @EmbeddedParameters(nullAllowed = false)
    @AttributeOverrides({
        @AttributeOverride(name = "city", column = @Column(name = "ADDRESS_CITY")),
        @AttributeOverride(name = "street", column = @Column(name = "ADDRESS_STREET")),
        @AttributeOverride(name = "houseNumber", column = @Column(name = "ADDRESS_HOUSE_NUMBER"))
    })
    protected Address address;

    @Column(name = "SHOP_TYPE")
    protected Integer shopType;

    @JoinTable(name = "SALES_SHOP_PRODUCT_LINK",
        joinColumns = @JoinColumn(name = "SHOP_ID"),
        inverseJoinColumns = @JoinColumn(name = "PRODUCT_ID"))
    @OnDeleteInverse(DeletePolicy.UNLINK)
    @OnDelete(DeletePolicy.UNLINK)
    @ManyToMany
    protected Set<Product> productList;

    public void setAddress(Address address) {
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }

    public void setShopType(ShopType shopType) {
        this.shopType = shopType == null ? null : shopType.getId();
    }

    public ShopType getShopType() {
        return shopType == null ? null : ShopType.fromId(shopType);
    }

    public void setProductList(Set<Product> productList) {
        this.productList = productList;
    }

    public Set<Product> getProductList() {
        return productList;
    }


}