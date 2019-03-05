alter table SALES_ORDER add constraint FK_SALES_ORDER_ON_SHOP foreign key (SHOP_ID) references SALES_SHOP(ID);
create index IDX_SALES_ORDER_ON_SHOP on SALES_ORDER (SHOP_ID);
