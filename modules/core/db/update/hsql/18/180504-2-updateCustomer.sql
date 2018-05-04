alter table SALES1_CUSTOMER add column PHONE varchar(15) ^
update SALES1_CUSTOMER set PHONE = '' where PHONE is null ;
alter table SALES1_CUSTOMER alter column PHONE set not null ;
