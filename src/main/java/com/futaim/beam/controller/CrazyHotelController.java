package com.futaim.beam.controller;

import com.futaim.beam.domain.CrazyHotel;
import com.futaim.beam.dao.impl.CrazyHotelDao;
import com.futaim.beam.service.CrazyHotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Anas Quedan
 */
@RestController
@RequestMapping(value = "/crazyHotel")
public class CrazyHotelController {

    /**
     *
     */
    @Autowired
    private CrazyHotelService crazyHotelService;

    /**
     * @param fromDate
     * @param toDate
     * @param city
     * @param numberOfAdults
     * @return
     */
    @GetMapping
    public ResponseEntity<List<CrazyHotel>> findAllBestHotels(@RequestParam String fromDate,
                                                              @RequestParam String toDate, @RequestParam String city, @RequestParam Integer numberOfAdults) {
        List<CrazyHotel> hotel = crazyHotelService.getHotel(fromDate, toDate, city, numberOfAdults);
        return ResponseEntity.ok(hotel);
    }

    @PostMapping
    public ResponseEntity<CrazyHotel> addCrazyHotel(@RequestBody CrazyHotel crazyHotel
    ) {
        return ResponseEntity.ok(crazyHotelService.setHotel(crazyHotel));
    }
}