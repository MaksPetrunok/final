package com.station.persistent;

import java.util.List;

public interface Dao<T> {

    boolean add(T t);

    List<T> getAll();
    T get(int id);

    boolean update(T t);

    void delete(T t);
}
