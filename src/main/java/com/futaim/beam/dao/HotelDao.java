package com.futaim.beam.dao;

import java.util.List;

public interface HotelDao<E, K> {

    E add(E entity);

    void remove(E entity);

    List<E> find(K key);

    List<E> list(String fromDate, String toDate, String city, Integer numberOfAdults);

}