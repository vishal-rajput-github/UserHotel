package com.lcwd.restaurant.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "restaurant")
public class Restaurant {

    @Id
    private String hotelId;
    private String name;
    private String location;
    private String about;

}
