#!/usr/bin/env bash

./mvnw clean install -DskipTests=true
docker build -f Dockerfile -t svite/ms-solicitudes:0.0.1 .