package com.futaim.beam.service;

import com.futaim.beam.domain.Hotel;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @param <T>
 * @author Anas Quedan
 */
@Service
public interface HotelService<T extends Hotel> {
    /**
     * @param fromDate
     * @param toDate
     * @param city
     * @param numberOfAdults
     * @return
     */
    List<T> getHotel(String fromDate, String toDate, String city, Integer numberOfAdults);

    T setHotel(T hotel);
}
