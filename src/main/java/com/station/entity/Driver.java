package com.station.entity;

import java.time.ZonedDateTime;
import java.util.Objects;

public class Driver extends Employee {

    private int experience_years;
    private int cdlClassId;

    public Driver(
            int id,
            String email,
            String firstName,
            String lastName,
            ZonedDateTime hireDate,
            String phone,
            int experience_years,
            int cdlClassId) {
        super(id, email, firstName, lastName, hireDate, phone);
        this.experience_years = experience_years;
        this.cdlClassId = cdlClassId;
    }

    public int getExperience_years() {
        return experience_years;
    }

    public void setExperience_years(int experience_years) {
        this.experience_years = experience_years;
    }

    public int getCdlClassId() {
        return cdlClassId;
    }

    public void setCdlClassId(int cdlClassId) {
        this.cdlClassId = cdlClassId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Driver driver = (Driver) o;
        return experience_years == driver.experience_years &&
                cdlClassId == driver.cdlClassId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), experience_years, cdlClassId);
    }

    @Override
    public String toString() {
        return "Driver{" +
                super.toString() +
                ", experience_years='" + experience_years + '\'' +
                ", cdlClassId=" + cdlClassId + '\'' +
                '}';
    }
}
