package com.example.RestaurantReviews.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.RestaurantReviews.Model.Review;
import com.example.RestaurantReviews.Service.ReviewService;
import java.util.*;

@RestController
public class ReviewController {
    @Autowired
    ReviewService service;

    @GetMapping("/reviews")
    public List<Review> getReviews(){
        return service.getReviews();
    }

    @GetMapping("/reviews/{id}")
    public Review getReviewById(@PathVariable int id){
        return service.getReviewById(id);
    }

    @PostMapping("/reviews/additem")
    public void addReview(@RequestBody Review rev){
        service.addReview(rev);
    }

    @PutMapping("/reviews/update/{id}")
    public ResponseEntity<Review> updateReview(@PathVariable int id, @RequestBody Review reviewDetails) {
        Review review = service.getReviewById(id);
        if (review!=null) {
            reviewDetails.setId(id);
            service.updateReview(review);
            return ResponseEntity.ok(service.getReviewById(id));
        }
        return ResponseEntity.notFound().build();
    }


    @PutMapping("/reviews/update")
    public void updateReview(@RequestBody Review rev){
        service.updateReview(rev);
    }


    @DeleteMapping("/reviews/{id}")
    public void deleteReview(@PathVariable int id){
        service.deleteReview(id);
    }
}
