create table EMPLOYEE
(
  ID SERIAL NOT NULL
    primary key,
  LAST_NAME VARCHAR(24) not null,
  first_name varchar(24) not null,
  email varchar(24),
  phone_number integer(12)
);

create table JOB
(
  ID SERIAL NOT NULL
    primary key,
  LAST_NAME VARCHAR(24) not null,
  first_name varchar(24) not null,
  email varchar(24),
  phone_number integer(12)
);

create table CUSTOMER
(
  ID SERIAL NOT NULL
    primary key,
  LAST_NAME VARCHAR(24) not null,
  first_name varchar(24) not null,
  email varchar(24),
  phone_number integer(12)
);
