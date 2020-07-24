CREATE TABLE SYSDBA.JDD_ADDRESS (
	ID DECIMAL(10,0) NOT NULL,
	COLUMN1 VARCHAR2(100),
	CONSTRAINT JDD_ADDRESS_PK PRIMARY KEY (ID)
)
TABLESPACE SYSTEM INIT 64K NEXT 64K MAXSIZE UNLIMITED  PCTFREE 10 PCTUSED 40 ;

CREATE SEQUENCE SYSDBA.SEQ_JDD INCREMENT BY 1 START WITH 1 MINVALUE 1 MAXVALUE 9223372036854775807 NO CYCLE  CACHE 1 ;SELECT SETVAL('SYSDBA.SEQ_JDD', 1) ;

ALTER TABLE SYSDBA.JDD_ADDRESS RENAME COLUMN COLUMN1 TO "NAME" ;