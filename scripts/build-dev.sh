#!/usr/bin/env bash

mvn -T 2C clean install -DskipTests

docker-compose -f docker-compose-dev.yml build
docker-compose -f docker-compose-dev.yml -p penger up --abort-on-container-exit
