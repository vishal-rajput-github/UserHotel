package com.lcwd.restaurant.controller;

import com.lcwd.restaurant.entity.Restaurant;
import com.lcwd.restaurant.services.RestaurantsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/apis/restaurant")
public class RestaurantController {

    @Autowired
    private RestaurantsService restaurantsService;

    @PostMapping("/save")
    public ResponseEntity<Restaurant> save(@RequestBody Restaurant restaurant ){
        Restaurant data = restaurantsService.create(restaurant);
        return new ResponseEntity<>(data, HttpStatus.CREATED);

    }

    @GetMapping("/getall")
    public ResponseEntity<List<Restaurant>> getAll(){
        List<Restaurant> list = restaurantsService.getAll();
        return ResponseEntity.ok(list);

    }

    @GetMapping("/{hotelId}")
    public ResponseEntity<Restaurant> getId(@PathVariable String hotelId){
       Restaurant sing =  restaurantsService.getId(hotelId);
       return ResponseEntity.ok(sing);
    }
}
