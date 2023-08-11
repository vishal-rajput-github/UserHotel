package com.lcwd.restaurant.services;

import com.lcwd.restaurant.entity.Restaurant;

import java.util.List;

public interface RestaurantsService {

    Restaurant create(Restaurant restaurant) ;

    List<Restaurant> getAll();

    Restaurant getId(String hotelId);
}
