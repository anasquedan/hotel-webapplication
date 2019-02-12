package com.futaim.beam.dao.impl;

import com.futaim.beam.dao.HotelDao;
import com.futaim.beam.domain.BestHotel;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class BestHotelDao implements HotelDao<BestHotel, Integer> {


    private List<BestHotel> bestHotelList = new ArrayList<>();

    @Override
    public BestHotel add(BestHotel bestHotel) {

        bestHotelList.add(bestHotel);
        return bestHotel;
    }

    @Override
    public void remove(BestHotel bestHotel) {

        bestHotelList.remove(bestHotel);


    }

    @Override
    public List<BestHotel> find(Integer key) {
        return bestHotelList.stream().filter(bestHotel -> bestHotel.getId().equals(key)).collect(Collectors.toList());
    }

    @Override
    public List<BestHotel> list(String fromDate, String toDate, String city, Integer numberOfAdults) {
        return bestHotelList.stream().filter(bestHotel -> bestHotel.getCity().equalsIgnoreCase(city) && bestHotel.getAdultNumber() >= numberOfAdults)
                .collect(Collectors.toList());
    }
}
