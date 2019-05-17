#!/bin/bash

#echo script location: `pwd`/`dirname $0`/`basename $0`

HOST_APP_DIR=/home/maks/FinalProject/src/main/webapp
CONTAINER_APP_DIR=/usr/local/tomcat/webapps/myapp

CONTAINER_NAME=tomcat_webapp
EXISTING_CONTAINERS=`docker ps -a | grep $CONTAINER_NAME | wc -l`

if [ $EXISTING_CONTAINERS -gt 0 ]
then
	echo "Existing docker container '$CONTAINER_NAME' found!"
	echo "Remove or rename it to proceed."
	exit 1
fi

docker run \
			-d \
			-p 8080:8080 \
			-v $HOST_APP_DIR:$CONTAINER_APP_DIR \
			--name $CONTAINER_NAME \
			tomcat
