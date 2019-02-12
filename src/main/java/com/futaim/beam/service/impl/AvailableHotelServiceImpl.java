package com.futaim.beam.service.impl;

import com.futaim.beam.dao.impl.AvailableHotelDao;
import com.futaim.beam.domain.DTOHotel;
import com.futaim.beam.service.AvailabletHotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Anas Quedan
 */
@Service
public class AvailableHotelServiceImpl implements AvailabletHotelService {

    /**
     *
     */
    @Autowired
    private AvailableHotelDao availableHotelDao;

    /*
     * (non-Javadoc)
     *
     * @see com.futaim.beam.service.HotelService#getHotel(java.lang.String,
     * java.lang.String, java.lang.String, java.lang.Integer)
     */
    @Override
    public List<DTOHotel> getHotel(String fromDate, String toDate, String city, Integer numberOfAdults) {
        return availableHotelDao.list(fromDate, toDate, city, numberOfAdults);
    }

    @Override
    public DTOHotel setHotel(DTOHotel availableHotel
    ) {
        return availableHotelDao.add(availableHotel);
    }
}
