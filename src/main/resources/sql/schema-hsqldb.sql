DROP SCHEMA IF EXISTS inventory CASCADE;

CREATE SCHEMA inventory;

CREATE TABLE Category (id LONG PRIMARY KEY IDENTITY,
                       name VARCHAR(60) NOT NULL,
                       type VARCHAR(60) NOT NULL);

CREATE TABLE Currency (id LONG PRIMARY KEY IDENTITY,
                       name VARCHAR(60),
                       abbreviation VARCHAR(3));

CREATE TABLE Product (id LONG PRIMARY KEY IDENTITY,
                      name VARCHAR(60) NOT NULL,
                      quantity LONG NOT NULL,
                      description VARCHAR(200),
                      price INT NOT NULL);

CREATE TABLE Product_category (id LONG PRIMARY KEY IDENTITY,
                               product_id LONG FOREIGN KEY REFERENCES product(id),
                               category_id LONG FOREIGN KEY REFERENCES category(id));