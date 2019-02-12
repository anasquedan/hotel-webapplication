package com.futaim.beam.controller;

import com.futaim.beam.domain.BestHotel;
import com.futaim.beam.domain.CrazyHotel;
import com.futaim.beam.service.BestHotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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