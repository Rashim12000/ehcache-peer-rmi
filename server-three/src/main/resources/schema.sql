create table CUSTOMER
        (
        ID      bigint auto_increment
        primary key,
        ACTIVE  char         not null,
        ADDRESS varchar(150) not null,
        NAME    varchar(150) not null
        );

        INSERT INTO ehcache.CUSTOMER (ID, ACTIVE, ADDRESS, NAME) VALUES (1, 'Y', 'nikosera', 'ServerTwo');