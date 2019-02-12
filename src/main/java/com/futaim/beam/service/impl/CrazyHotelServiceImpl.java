package com.futaim.beam.service.impl;

import java.util.List;

import com.futaim.beam.dao.impl.CrazyHotelDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.futaim.beam.domain.CrazyHotel;
import com.futaim.beam.service.CrazyHotelService;

/**
 * @author Anas Quedan
 */
@Service
public class CrazyHotelServiceImpl implements CrazyHotelService {

    /**
     *
     */
    @Autowired
    private CrazyHotelDao crazyHotelDao;
    /*
     * (non-Javadoc)
     *
     * @see com.futaim.beam.service.HotelService#getHotel(java.lang.String,
     * java.lang.String, java.lang.String, java.lang.Integer)
     */
    @Override
    public List<CrazyHotel> getHotel(String fromDate, String toDate, String city, Integer numberOfAdults) {
        return crazyHotelDao.list(fromDate, toDate, city, numberOfAdults);
    }

    @Override
    public CrazyHotel setHotel(CrazyHotel crazyHotel) {
        return crazyHotelDao.add(crazyHotel);
    }
}
