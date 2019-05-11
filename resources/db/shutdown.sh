DATABASE_NAME=bus_station_db
DUMP_FILE=./dump/bus_station_dump_`date +%F-%H:%M:%S`.sql # save dump as unique file
CONTAINER_NAME=mysql_bus_station_app

docker exec -i $CONTAINER_NAME mysqldump -u root $DATABASE_NAME > $DUMP_FILE

if [ ! $? -eq 0 ] && [ "$1" != '-f' ]
then
	echo 'Failed to create database dump. Docker container 'mysql_bus_station' is not removed for safety reason.'
	echo 'To remove docker container anyway use -f flag.'
	exit $?
fi

if [ $? -eq 0 ] || [ "$1" == '-f' ]
then
	docker stop $CONTAINER_NAME
	docker rm $CONTAINER_NAME
	echo "MySQL container stopped and removed"
fi

