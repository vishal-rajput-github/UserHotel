package com.lcwd.restaurant.services.Impl;

import com.lcwd.restaurant.entity.Restaurant;
import com.lcwd.restaurant.excecption.ResourceNotFoundException;
import com.lcwd.restaurant.repository.RestaurantRepository;
import com.lcwd.restaurant.services.RestaurantsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;


@Service
public class RestaurantServiceImpl implements RestaurantsService {

    @Autowired
    private RestaurantRepository restaurantRepo;

    @Override
    public Restaurant create(Restaurant restaurant) {
        String randomid = UUID.randomUUID().toString();
        restaurant.setHotelId(randomid);
        return restaurantRepo.save(restaurant);
    }

    @Override
    public List<Restaurant> getAll() {
        return restaurantRepo.findAll();
    }

    @Override
    public Restaurant getId(String hotelId) {
       return restaurantRepo.findById(hotelId).orElseThrow(
                () -> new ResourceNotFoundException("id is not here :" + hotelId)
        );

    }
}
