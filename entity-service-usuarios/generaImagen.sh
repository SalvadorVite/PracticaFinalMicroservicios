#!/usr/bin/env bash

./mvnw clean install -DskipTests=true
docker build -f Dockerfile -t svite/entity-service-usuarios:0.0.1 .