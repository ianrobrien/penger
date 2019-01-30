#!/usr/bin/env bash

mvn -T 2C clean install -DskipTests
#pushd frontend
#npm install && npm run build-no-aot
#popd

docker-compose -f ./docker/docker-compose-dev.yml build
docker-compose -f ./docker/docker-compose-dev.yml -p penger up --abort-on-container-exit
