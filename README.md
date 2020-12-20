# spring-boot2-webflux-azure-mssql-jdbc

DDL schema & create table
```
create schema employee
go

create table employee.employees
(
    uid       varchar(100) not null,
    username  varchar(50),
    firstname varchar(100),
    lastname  varchar(100),
    address   varchar(200),
    constraint employees_pk
        primary key (uid)
)
go
```

JDK 15

```
Download MacOS & Windows:

https://jdk.java.net/15/
```

