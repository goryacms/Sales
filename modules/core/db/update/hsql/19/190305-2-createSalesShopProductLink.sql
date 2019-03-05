alter table SALES_SHOP_PRODUCT_LINK add constraint FK_SHOPRO_ON_SHOP foreign key (SHOP_ID) references SALES_SHOP(ID);
alter table SALES_SHOP_PRODUCT_LINK add constraint FK_SHOPRO_ON_PRODUCT foreign key (PRODUCT_ID) references SALES_PRODUCT(ID);
