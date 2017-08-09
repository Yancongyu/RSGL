CREATE TABLE tab_user(
       ID NUMBER(11) NOT NULL PRIMARY KEY,
       username VARCHAR2(30) NOT NULL UNIQUE,
       PASSWORD VARCHAR2(50) NOT NULL ,
       RULE VARCHAR2(2) DEFAULT('2') NOT NULL,
       realname VARCHAR2(50 )NOT NULL,
       sex CHAR(1) DEFAULT('1') NOT NULL,
       city NUMBER(11) NOT NULL,
       cert_type NUMBER(11) NOT NULL,
       cert VARCHAR2(50) NOT NULL,
       birthday DATE NOT NULL,
       user_type NUMBER(11),
       CONTENT VARCHAR2(3000),
       status CHAR(1) DEFAULT('1') NOT NULL,
       login_ip VARCHAR2(50),
       image_path VARCHAR2(200),
       CONSTRAINT user_city_fk FOREIGN KEY(city) REFERENCES tab_city(ID),
       CONSTRAINT user_certtype_fk FOREIGN KEY(cert_type) REFERENCES tab_certtype(ID),
       CONSTRAINT user_usertype_fk FOREIGN KEY(user_type) REFERENCES tab_usertype(ID)
)

CREATE TABLE tab_province(
       ID NUMBER(11) NOT NULL PRIMARY KEY,
       provinceID VARCHAR2(6) UNIQUE,
       province VARCHAR2(40)
)

CREATE TABLE tab_city(
       ID NUMBER(11) NOT NULL PRIMARY KEY,
       cityID VARCHAR2(6),
       city VARCHAR2(50),
       father VARCHAR2(6),
       CONSTRAINT city_province_fk FOREIGN KEY(father) REFERENCES tab_province(provinceID)
)

CREATE TABLE tab_usertype(
       ID NUMBER(11) NOT NULL PRIMARY KEY,
       CONTENT VARCHAR2(40)
)

CREATE TABLE tab_certtype(
       ID NUMBER(11) NOT NULL PRIMARY KEY,
       CONTENT VARCHAR2(20)
)
