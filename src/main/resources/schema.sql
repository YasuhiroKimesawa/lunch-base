DROP SCHEMA IF EXISTS customer;
CREATE SCHEMA customer;

CREATE SEQUENCE customer.customer_id;

DROP TABLE IF EXISTS customer.customers;
CREATE TABLE customer.customers (
        customer_id  INTEGER PRIMARY KEY,
        family_name VARCHAR(20) NOT NULL,
        first_name VARCHAR(20) NOT NULL
);

COMMENT ON TABLE customer.customers IS '顧客';
COMMENT ON COLUMN customer.customers.customer_id IS '利用者ID';
COMMENT ON COLUMN customer.customers.family_name IS '利用者名';
COMMENT ON COLUMN customer.customers.first_name IS '電話番号';
