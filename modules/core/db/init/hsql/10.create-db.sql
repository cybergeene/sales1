-- begin SALES1_CUSTOMER
create table SALES1_CUSTOMER (
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
    EMAIL varchar(255) not null,
    PHONE longvarchar not null,
    --
    primary key (ID)
)^
-- end SALES1_CUSTOMER
