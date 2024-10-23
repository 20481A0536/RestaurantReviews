package com.example.RestaurantReviews.Repository;

import org.springframework.data.jpa.repository.JpaRepository; // {{ edit_1 }}
import org.springframework.stereotype.Repository;

import com.example.RestaurantReviews.Model.*;

@Repository
public interface ReviewRepo extends JpaRepository<Review,Integer> {
    
}
