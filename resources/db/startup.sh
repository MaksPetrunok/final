APP_NAME=bus_station_app
DATABASE_NAME=bus_station_db
DUMP_FILE=./dump/`ls -t1 dump | head -n 1` # latest created database dump

CONTAINER_NAME=mysql_bus_station_app
EXISTING_CONTAINERS=`docker ps -a | grep $CONTAINER_NAME | wc -l`

#MOUNT_VOLUME_DIR=~/$APP_NAME

#mkdir -p $MOUNT_VOLUME_DIR

if [ $EXISTING_CONTAINERS -gt 0 ]
then
	echo "Existing docker container '$CONTAINER_NAME' found!"
	echo "Remove or rename it to proceed."
	exit 1
fi

#	--mount type=volume,src=mysql_volume,dst=$MOUNT_VOLUME_DIR \
docker run \
	-e MYSQL_ALLOW_EMPTY_PASSWORD=true \
	-e MYSQL_DATABASE=$DATABASE_NAME \
	-p 3306:3306 \
	-d \
	--name $CONTAINER_NAME \
	mysql

if [ ! $? -eq 0 ]
then
	echo "Something went wrong during creation docker container for mysql server."
	exit $?
fi


echo "MySQL container created."
echo "Filling database from dump file. It may take a minute..."

N_RETRY=20
TIMEOUT=5 #seconds

for (( N=1; N<=$N_RETRY; N++ ))
do
	echo -n "Attempt $N/$N_RETRY: "
	sleep $TIMEOUT
	docker exec -i $CONTAINER_NAME mysql -u root $DATABASE_NAME < $DUMP_FILE 1>&- 2>&- \
		&& echo "Database '$DATABASE_NAME' successfully filled." && exit 0 \
		|| echo "failed to connect."
done

