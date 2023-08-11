package com.lcwd.restaurant.repository;

import com.lcwd.restaurant.entity.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RestaurantRepository extends JpaRepository<Restaurant,String> {
}
