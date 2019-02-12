package com.futaim.beam.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.futaim.beam.domain.BestHotel;
import com.futaim.beam.service.BestHotelService;

/**
 * @author Anas Quedan
 */
@RestController
@RequestMapping(value = "/bestHotel")
public class BestHotelController {

    /**
     *
     */
    @Autowired
    private BestHotelService bestHotelService;

    /**
     * @param fromDate
     * @param toDate
     * @param city
     * @param numberOfAdults
     * @return
     */
    @GetMapping
    public ResponseEntity<List<BestHotel>> findAllBestHotels(@RequestParam String fromDate, @RequestParam String toDate,
                                                             @RequestParam String city, @RequestParam Integer numberOfAdults) {
        List<BestHotel> hotel = bestHotelService.getHotel(fromDate, toDate, city, numberOfAdults);
        return ResponseEntity.ok(hotel);
    }

    @PostMapping
    public ResponseEntity<BestHotel> addBestHotel(@RequestBody BestHotel bestHotel
    ) {
        return ResponseEntity.ok(bestHotelService.setHotel(bestHotel));
    }
}