package com.example.RestaurantReviews.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.RestaurantReviews.Service.*;
import java.util.*;
import com.example.RestaurantReviews.Model.*;

@RestController
public class RestaurantController {
    @Autowired
    RestaurantService service;

    @GetMapping("/restaurants")
    public List<Restaurant> getRestaurant(){
        return service.getRestaurants();
    }

    @GetMapping("/restaurants/{id}")
    public Restaurant getRestaurantById(@PathVariable int id){
        return service.getRestaurantById(id);
    }

    @PostMapping("/restaurants/additem")
    public void addRestaurant(@RequestBody Restaurant rest){
        service.addRestaurant(rest);
    }

    @PutMapping("/restaurants/update")
    public void updateRestaurant(@RequestBody Restaurant rest){
        service.updateRestaurant(rest);
    }

    @DeleteMapping("/restaurants/{id}")
    public void deleteRestaurant(@PathVariable int id){
        service.deleteRestaurant(id);
    }    
}
