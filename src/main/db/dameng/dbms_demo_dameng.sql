create table "BENCHMARKSQL"."JDD_ADDRESS"
(
	"id" INTEGER not null ,
	"name" VARCHAR2(128),
	primary key("id")
)
storage(initial 1, next 1, minextents 1, fillfactor 0)
;

CREATE SEQUENCE "BENCHMARKSQL"."SEQ_JDD" INCREMENT BY 1 START WITH 1 MAXVALUE 99999999999999 MINVALUE 1;