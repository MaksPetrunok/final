package com.station.entity;

import java.time.Duration;
import java.util.Objects;

public class Route {
    private  int id;

    private String departureCity;
    private String destinationCity;
    private int distance;
    private Duration duration;

    public Route(int id, String departureCity, String destinationCity, int distance, Duration duration) {
        this.id = id;
        this.departureCity = departureCity;
        this.destinationCity = destinationCity;
        this.distance = distance;
        this.duration = duration;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDepartureCity() {
        return departureCity;
    }

    public void setDepartureCity(String departureCity) {
        this.departureCity = departureCity;
    }

    public String getDestinationCity() {
        return destinationCity;
    }

    public void setDestinationCity(String destinationCity) {
        this.destinationCity = destinationCity;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public Duration getDuration() {
        return duration;
    }

    public void setDuration(Duration duration) {
        this.duration = duration;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Route route = (Route) o;
        return id == route.id &&
                distance == route.distance &&
                Objects.equals(departureCity, route.departureCity) &&
                Objects.equals(destinationCity, route.destinationCity) &&
                Objects.equals(duration, route.duration);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, departureCity, destinationCity, distance, duration);
    }

    @Override
    public String toString() {
        return "Route{" +
                "id=" + id +
                ", departureCity='" + departureCity + '\'' +
                ", destinationCity='" + destinationCity + '\'' +
                ", distance=" + distance +
                ", duration=" + duration +
                '}';
    }
}
