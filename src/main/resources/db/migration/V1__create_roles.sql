CREATE TABLE roles (
                       id SMALLINT PRIMARY KEY,
                       name VARCHAR(20) NOT NULL UNIQUE
);

INSERT INTO roles (id, name)
VALUES
    (1, 'USER'),
    (2, 'ADMIN');