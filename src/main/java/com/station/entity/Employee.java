package com.station.entity;

import java.time.ZonedDateTime;
import java.util.Objects;

public abstract class Employee {

    protected int id;
    protected String email;
    protected String firstName;
    protected String lastName;
    protected ZonedDateTime hireDate;
    protected String phone;

    public Employee(int id, String email, String firstName, String lastName, ZonedDateTime hireDate, String phone) {
        this.id = id;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.hireDate = hireDate;
        this.phone = phone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public ZonedDateTime getHireDate() {
        return hireDate;
    }

    public void setHireDate(ZonedDateTime hireDate) {
        this.hireDate = hireDate;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id &&
                Objects.equals(email, employee.email) &&
                Objects.equals(firstName, employee.firstName) &&
                Objects.equals(lastName, employee.lastName) &&
                Objects.equals(hireDate, employee.hireDate) &&
                Objects.equals(phone, employee.phone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, email, firstName, lastName, hireDate, phone);
    }

    @Override
    public String toString() {
        return  "id=" + id +
                ", email='" + email + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", hireDate=" + hireDate +
                ", phone='" + phone + '\'';
    }
}
