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
);
