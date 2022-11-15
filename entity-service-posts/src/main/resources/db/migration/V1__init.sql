CREATE TABLE catalogos_tipos_pulicaciones (
  id VARCHAR(255) PRIMARY KEY,
  nombre VARCHAR(500) NOT NULL,
  descripcion VARCHAR(500) NOT NULL,
  status BOOLEAN NOT NULL DEFAULT TRUE
);

insert into catalogos_tipos_pulicaciones(id, nombre, descripcion, status) VALUES(1, 'Estados', 'Publicaciones temporales.', true);
insert into catalogos_tipos_pulicaciones(id, nombre, descripcion, status) VALUES(2, 'Publicaciones de perfil', 'Publicaciones permanentes.', true);

CREATE TABLE posts (
    id_publicacion VARCHAR(255) PRIMARY KEY,
    id_usuario VARCHAR(255) NOT NULL,
    titulo VARCHAR(255) NOT NULL,
    descripcion VARCHAR(255) NOT NULL,
    foto_url VARCHAR(2000),
    id_tipo_publicacion VARCHAR(255) NOT NULL,
    post_publico BOOLEAN NOT NULL DEFAULT FALSE,
    status BOOLEAN NOT NULL DEFAULT FALSE,
    fecha_creacion VARCHAR(255),
    fecha_actualizacion VARCHAR(255),
    FOREIGN KEY (id_tipo_publicacion) REFERENCES catalogos_tipos_pulicaciones (id)
);