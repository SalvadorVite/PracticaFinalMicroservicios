CREATE TABLE usuarios (
    id VARCHAR(255) PRIMARY KEY,
    usuario VARCHAR(255) NOT NULL,
    nombre VARCHAR(255) NOT NULL,
    apellido_paterno VARCHAR(255) NOT NULL,
    apellido_materno VARCHAR(255) NOT NULL,
    edad Integer,
    email VARCHAR(255) NOT NULL,
    direccion VARCHAR(255) NOT NULL,
    status BOOLEAN NOT NULL DEFAULT FALSE
);