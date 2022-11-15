#!/usr/bin/env bash

cd discovery-server
./generaImagen.sh

cd ../

cd arquitectura-monitor-server
./generaImagen.sh

cd ../

cd arquitectura-gateway
./generaImagen.sh

cd ../

cd ms-confirmaciones
./generaImagen.sh

cd ../

cd task-service-amigos
./generaImagen.sh

cd ../

cd ms-solicitudes
./generaImagen.sh

cd ../


docker-compose up --build

docker-compose stop
docker-compose kill
docker-compose rm -f