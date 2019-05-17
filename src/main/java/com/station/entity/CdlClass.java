package com.station.entity;

public enum CdlClass {
    B(1), C(2);

    private final int id;

    CdlClass(int id) {
        this.id = id;
    }

    public static CdlClass get(int id) {
        return CdlClass.values()[id - 1];
    }

    public static void main(String[] args) {

        System.out.println(CdlClass.B.id);
        System.out.println(CdlClass.C.id);
        System.out.println(CdlClass.get(1));
        System.out.println(CdlClass.valueOf("B").id);
    }
}
