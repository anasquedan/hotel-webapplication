package com.futaim.beam.service.impl;

import com.futaim.beam.dao.impl.BestHotelDao;
import com.futaim.beam.domain.BestHotel;
import com.futaim.beam.service.BestHotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Anas Quedan
 */
@Service
public class BestHotelServiceImpl implements BestHotelService {
    /*
     *
     */
    @Autowired
    private BestHotelDao bestHotelDao;

    /*
     * (non-Javadoc)
     *
     * @see com.futaim.beam.service.HotelService#getHotel(java.lang.String,
     * java.lang.String, java.lang.String, java.lang.Integer)
     */
    @Override
    public List<BestHotel> getHotel(String fromDate, String toDate, String city, Integer numberOfAdults) {
        return bestHotelDao.list(fromDate, toDate, city, numberOfAdults);
    }

    @Override
    public BestHotel setHotel(BestHotel bestHotel) {
        return bestHotelDao.add(bestHotel);
    }
}
