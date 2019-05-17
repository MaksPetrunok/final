package com.station.entity;

import java.util.Objects;

public class Bus {

    private int id;
    private String model;
    private int seatAmount;
    private int cdlClassId;

    public Bus(int id, String model, int seatAmount, int cdlClassId) {
        this.id = id;
        this.model = model;
        this.seatAmount = seatAmount;
        this.cdlClassId = cdlClassId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSeatAmount() {
        return seatAmount;
    }

    public void setSeatAmount(int seatAmount) {
        this.seatAmount = seatAmount;
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
        Bus bus = (Bus) o;
        return  id == bus.id &&
                seatAmount == bus.seatAmount &&
                cdlClassId == bus.cdlClassId &&
                Objects.equals(model, bus.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, model, seatAmount, cdlClassId);
    }

    @Override
    public String toString() {
        return "Bus{" +
                "id='" + id + '\'' +
                ", model='" + model + '\'' +
                ", seatAmount=" + seatAmount +
                ", cdlClassId=" + cdlClassId +
                '}';
    }
}
