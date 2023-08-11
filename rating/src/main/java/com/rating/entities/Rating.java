package com.rating.entities;

import lombok.*;
import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "ratings")
public class Rating {

    @Id
    private String ratingId;
    private int rating;
    private String feedback;
    private String userId;
    private String hotelId;

}
