#!/usr/bin/env bash

./mvnw clean install -DskipTests=true
docker build -f Dockerfile -t svite/arquitectura-gateway:0.0.1 .
#docker run -p 8761:8761 -t svite/arquitectura-gateway:0.0.1