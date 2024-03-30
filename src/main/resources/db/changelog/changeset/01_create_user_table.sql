-- liquibase formatted sql

-- changeset Ranjith:01 context:prod
-- comment: create table user

CREATE TABLE user
(
    id   BIGINT       NOT NULL,
    name VARCHAR(255) NULL,
    age  INT          NULL,
    CONSTRAINT pk_user PRIMARY KEY (id)
);

-- rollback DROP TABLE user;

