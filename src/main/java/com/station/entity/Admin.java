package com.station.entity;

import java.time.ZonedDateTime;

public class Admin extends Employee {

    public Admin(int id, String email, String firstName, String lastName, ZonedDateTime hireDate, String phone) {
        super(id, email, firstName, lastName, hireDate, phone);
    }

    @Override
    public String toString() {
        return "Admin{" + super.toString() + "}";
    }
}
