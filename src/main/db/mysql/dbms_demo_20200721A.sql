CREATE DATABASE dbms_demo DEFAULT CHARACTER SET utf8mb4 DEFAULT COLLATE utf8mb4_general_ci;

USE dbms_demo;

CREATE TABLE `dbms_demo`.`jdd_address`  (
  `id` decimal(10, 0) NOT NULL COMMENT '主键ID',
  `name` varchar(128) NULL COMMENT '名称',
  PRIMARY KEY (`id`)
);