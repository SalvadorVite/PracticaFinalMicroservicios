CREATE TABLE confirmaciones_amistad (
  id VARCHAR(255) PRIMARY KEY,
  id_solicitud VARCHAR(255),
  detalles_solicitud VARCHAR(3000),
  respuesta_solicitud BOOLEAN NOT NULL DEFAULT FALSE,
  status BOOLEAN NOT NULL DEFAULT FALSE,
  fecha_confirmacion VARCHAR
);