-- begin SALES_CUSTOMER
create table SALES_CUSTOMER (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(100) not null,
    EMAIL varchar(50) not null,
    --
    primary key (ID)
)^
-- end SALES_CUSTOMER
-- begin SALES_ORDER
create table SALES_ORDER (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    CUSTOMER_ID varchar(36),
    TOTAL decimal(19, 2),
    SHOP_ID varchar(36),
    ORDER_LINE_LIST_ID varchar(36),
    DATE_ date not null,
    AMOUNT decimal(19, 2),
    --
    primary key (ID)
)^
-- end SALES_ORDER
-- begin SALES_PRODUCT
create table SALES_PRODUCT (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(150) not null,
    PRICE decimal(19, 2) not null,
    --
    primary key (ID)
)^
-- end SALES_PRODUCT
-- begin SALES_SHOP
create table SALES_SHOP (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    ADDRESS_CITY varchar(50),
    ADDRESS_STREET varchar(50),
    ADDRESS_HOUSE_NUMBER varchar(10),
    --
    SHOP_TYPE integer,
    --
    primary key (ID)
)^
-- end SALES_SHOP
-- begin SALES_ORDER_LINE
create table SALES_ORDER_LINE (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    PRODUCT_ID varchar(36),
    QUANTITY integer,
    --
    primary key (ID)
)^
-- end SALES_ORDER_LINE
-- begin SALES_SHOP_PRODUCT_LINK
create table SALES_SHOP_PRODUCT_LINK (
    SHOP_ID varchar(36) not null,
    PRODUCT_ID varchar(36) not null,
    primary key (SHOP_ID, PRODUCT_ID)
)^
-- end SALES_SHOP_PRODUCT_LINK
