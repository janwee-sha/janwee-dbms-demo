CREATE DATABASE dbms_demo DEFAULT CHARACTER SET utf8mb4 DEFAULT COLLATE utf8mb4_general_ci;

USE dbms_demo;

CREATE TABLE `dbms_demo`.`jdd_address`  (
  `id` decimal(10, 0) NOT NULL COMMENT '主键ID',
  `name` varchar(128) NULL COMMENT '名称',
  PRIMARY KEY (`id`)
);

CREATE TABLE `dbms_demo`.`seq_jdd`  (
  `next_val` bigint(20) NULL DEFAULT NULL
);

INSERT INTO `dbms_demo`.`seq_jdd`(next_val) VALUES(1);