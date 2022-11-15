CREATE TABLE catalogos_tipos_solicitudes (
  id VARCHAR(255) PRIMARY KEY,
  nombre VARCHAR(500) NOT NULL,
  descripcion VARCHAR(500) NOT NULL,
  status BOOLEAN NOT NULL DEFAULT TRUE
);

insert into catalogos_tipos_solicitudes(id, nombre, descripcion, status) VALUES(1, 'Enviadas', 'Solicitudes de amistad enviadas.', true);
insert into catalogos_tipos_solicitudes(id, nombre, descripcion, status) VALUES(2, 'Recibidas', 'Solicitudes de amistad recibidas.', true);

CREATE TABLE solicitudes (
  id_solicitud VARCHAR(255) PRIMARY KEY,
  id_usuario VARCHAR(255) NOT NULL,
  id_tipo_solicitud VARCHAR(255) NOT NULL,
  status BOOLEAN NOT NULL DEFAULT FALSE,
  detalles_solicitud VARCHAR(255),
  fecha_solicitud VARCHAR,
  fecha_operacion VARCHAR,
  FOREIGN KEY (id_tipo_solicitud) REFERENCES catalogos_tipos_solicitudes (id)
);