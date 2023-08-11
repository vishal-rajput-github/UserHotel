package com.rating.controller;

import com.rating.entities.Rating;
import com.rating.service.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Rating")
public class RatingController {

    @Autowired
    private RatingService ratingService;

    @PostMapping("/save")
    public ResponseEntity<Rating> create(@RequestBody Rating rating){
        return ResponseEntity.status(HttpStatus.CREATED).body(ratingService.create(rating));
    }

    @GetMapping("/get")
    public ResponseEntity<List<Rating>> getRating(){
       List<Rating> list =  ratingService.getRating();
       return ResponseEntity.ok(list);
    }

    @GetMapping("/user/{userId}")
    public ResponseEntity<List<Rating>> getRatingByUserId(String userId){
        return ResponseEntity.ok(ratingService.getRatingByUserId(userId));
    }

    @GetMapping("/hotel/{hotelId}")
    public ResponseEntity<List<Rating>> getRatingByHotelId(String hotelId){
        return ResponseEntity.ok(ratingService.getRatingByUserId(hotelId));
    }
}
