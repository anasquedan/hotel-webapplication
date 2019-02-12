package com.futaim.beam.dao.impl;

import com.futaim.beam.dao.HotelDao;
import com.futaim.beam.domain.BestHotel;
import com.futaim.beam.domain.CrazyHotel;
import com.futaim.beam.domain.DTOHotel;
import com.futaim.beam.domain.Provider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class AvailableHotelDao implements HotelDao<DTOHotel, Integer> {

    @Autowired
    private BestHotelDao bestHotelDao;

    @Autowired
    private CrazyHotelDao crazyHotelDao;

    private List<DTOHotel> dtoHotelList = new ArrayList<>();

    @Override
    public DTOHotel add(DTOHotel dtoHotel) {
        dtoHotelList.add(dtoHotel);
        return dtoHotel;
    }

    @Override
    public void remove(DTOHotel dtoHotel) {
        dtoHotelList.remove(dtoHotel);

    }

    @Override
    public List<DTOHotel> find(Integer key) {
        return dtoHotelList.stream().filter(dtoHotel -> dtoHotel.getId().equals(key)).collect(Collectors.toList());
    }

    @Override
    public List<DTOHotel> list(String fromDate, String toDate, String city, Integer numberOfAdults) {

        List<BestHotel> bestHotelList = bestHotelDao.list(fromDate, toDate, city, numberOfAdults);
        List<CrazyHotel> crazyHotelList = crazyHotelDao.list(fromDate, toDate, city, numberOfAdults);

        List<DTOHotel> dtoHotelList = new ArrayList<>();

        convertBestToDTO(bestHotelList, dtoHotelList);

        convertCrazyToDTO(crazyHotelList, dtoHotelList);


        return dtoHotelList.stream().sorted(Comparator.comparing(DTOHotel::getRate).reversed()).collect(Collectors.toList());
    }

    private void convertCrazyToDTO(List<CrazyHotel> crazyHotelList, List<DTOHotel> dtoHotelList) {
        for (CrazyHotel crazyHotel : crazyHotelList) {
            DTOHotel dtoHotel = new DTOHotel();
            dtoHotel.setId(crazyHotel.getId());
            dtoHotel.setFromDate(crazyHotel.getFromDate());
            dtoHotel.setToDate(crazyHotel.getToDate());
            dtoHotel.setAmenities(crazyHotel.getAmenities());
            dtoHotel.setCity(crazyHotel.getCity());
            dtoHotel.setProvider(Provider.CRAZY);
            dtoHotel.setHotelName(crazyHotel.getHotelName());
            dtoHotel.setRate((int) crazyHotel.getRate().chars().filter(ch -> ch == '*').count());
            dtoHotelList.add(dtoHotel);
        }
    }

    private void convertBestToDTO(List<BestHotel> bestHotelList, List<DTOHotel> dtoHotelList) {
        for (BestHotel bestHotel : bestHotelList) {
            DTOHotel dtoHotel = new DTOHotel();
            dtoHotel.setId(bestHotel.getId());
            dtoHotel.setFromDate(bestHotel.getFromDate());
            dtoHotel.setToDate(bestHotel.getToDate());
            dtoHotel.setAmenities(Arrays.asList(bestHotel.getRoomAmenities().split(",")));
            dtoHotel.setCity(bestHotel.getCity());
            dtoHotel.setFare(bestHotel.getHotelFare());
            dtoHotel.setProvider(Provider.BEST);
            dtoHotel.setHotelName(bestHotel.getHotel());
            dtoHotel.setRate(bestHotel.getHotelRate());
            dtoHotel.setAdultNumber(bestHotel.getAdultNumber());
            dtoHotelList.add(dtoHotel);
        }
    }
}
