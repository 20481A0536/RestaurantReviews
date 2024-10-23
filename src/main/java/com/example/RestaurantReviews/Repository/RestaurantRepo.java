package com.example.RestaurantReviews.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.RestaurantReviews.Model.*;

@Repository
public interface RestaurantRepo extends JpaRepository<Restaurant,Integer> {

}
