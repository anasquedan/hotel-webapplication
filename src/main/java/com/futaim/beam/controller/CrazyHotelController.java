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

import com.futaim.beam.domain.CrazyHotel;
import com.futaim.beam.service.CrazyHotelService;

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