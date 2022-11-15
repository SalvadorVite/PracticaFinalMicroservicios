CREATE TABLE amigos (
  id_amistad VARCHAR(255) PRIMARY KEY,
  id_usuario VARCHAR(255)  NOT NULL,
  id_amigo VARCHAR(255)  NOT NULL,
  status BOOLEAN NOT NULL DEFAULT FALSE,
  fecha_creacion VARCHAR,
  fecha_inicio_amistad VARCHAR
);