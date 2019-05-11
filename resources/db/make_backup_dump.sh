DATABASE_NAME=bus_station_db
DUMP_FILE=./dump/bus_station_dump_`date +%F-%H:%M:%S`.sql # save dump as unique file
CONTAINER_NAME=mysql_bus_station_app

docker exec -i $CONTAINER_NAME mysqldump -u root $DATABASE_NAME > $DUMP_FILE

