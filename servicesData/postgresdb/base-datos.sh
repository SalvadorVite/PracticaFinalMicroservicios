#!/bin/bash
set -e

psql -v ON_ERROR_STOP=1 --username "$POSTGRES_USER" <<-EOSQL

    CREATE USER admin PASSWORD 'admin';

    CREATE DATABASE examen_usuarios OWNER admin;
    GRANT ALL PRIVILEGES ON DATABASE examen_usuarios TO admin;

    CREATE DATABASE examen_posts OWNER admin;
    GRANT ALL PRIVILEGES ON DATABASE examen_posts TO admin;

    CREATE DATABASE examen_amigos OWNER admin;
    GRANT ALL PRIVILEGES ON DATABASE examen_amigos TO admin;

    CREATE DATABASE confirmaciones_amistad OWNER admin;
    GRANT ALL PRIVILEGES ON DATABASE confirmaciones_amistad TO admin;

    CREATE DATABASE solicitudes_amistad OWNER admin;
    GRANT ALL PRIVILEGES ON DATABASE solicitudes_amistad TO admin;

EOSQL