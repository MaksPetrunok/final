package com.station.entity;

import java.time.ZonedDateTime;

public class Trip {

    private int id;
    private Route route;
    private ZonedDateTime departureTime;
    private Bus bus;
    private Driver driver;
    private Admin admin;
    private String status;

    public Trip(int id, Route route, ZonedDateTime departureTime, Bus bus, Driver driver, Admin admin, String status) {
        this.id = id;
        this.route = route;
        this.departureTime = departureTime;
        this.bus = bus;
        this.driver = driver;
        this.admin = admin;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Route getRoute() {
        return route;
    }

    public void setRoute(Route route) {
        this.route = route;
    }

    public ZonedDateTime getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(ZonedDateTime departureTime) {
        this.departureTime = departureTime;
    }

    public Bus getBus() {
        return bus;
    }

    public void setBus(Bus bus) {
        this.bus = bus;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public Admin getAdmin() {
        return admin;
    }

    public void setAdmin(Admin admin) {
        this.admin = admin;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
