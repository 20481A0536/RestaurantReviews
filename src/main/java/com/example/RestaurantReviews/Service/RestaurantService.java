package com.example.RestaurantReviews.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.RestaurantReviews.Model.*;
import java.util.*;

import com.example.RestaurantReviews.Repository.RestaurantRepo;

@Service
public class RestaurantService {
    @Autowired
    RestaurantRepo resRepo;

    public List<Restaurant> getRestaurants(){
        return resRepo.findAll();
    }

    public Restaurant getRestaurantById(int id){
        return resRepo.findById(id).orElseThrow(()-> new RuntimeException("Not found"));
    }

    public void addRestaurant(Restaurant res){
        resRepo.save(res);
    }

    public void updateRestaurant(Restaurant res){
        resRepo.save(res);
    }

    public void deleteRestaurant(int id){
        resRepo.deleteById(id);
    }
}
