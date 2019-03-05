create table SALES_SHOP_PRODUCT_LINK (
    SHOP_ID varchar(36) not null,
    PRODUCT_ID varchar(36) not null,
    primary key (SHOP_ID, PRODUCT_ID)
);
