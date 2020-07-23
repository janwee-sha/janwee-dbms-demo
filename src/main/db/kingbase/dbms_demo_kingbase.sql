CREATE
    TABLE
        "benchmarksql"."jdd_address"(
            id INTEGER,
            name NVARCHAR2(
                128 CHAR
            )
        ) TABLESPACE "SYS_DEFAULT";

ALTER TABLE
    "benchmarksql"."jdd_address" ADD CONSTRAINT benchmarksql_jdd_address_CONSTRAINT_1 PRIMARY KEY(id);

CREATE
    SEQUENCE "benchmarksql"."SEQ_JDD" INCREMENT BY 1 MINVALUE 1 MAXVALUE 999999 START WITH 1 CACHE 1 NO CYCLE;

ALTER SEQUENCE "benchmarksql"."SEQ_JDD" OWNER TO "SYSTEM";
