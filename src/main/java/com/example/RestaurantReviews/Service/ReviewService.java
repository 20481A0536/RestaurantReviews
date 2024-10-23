package com.example.RestaurantReviews.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.RestaurantReviews.Repository.ReviewRepo;
import com.example.RestaurantReviews.Model.*;

@Service
public class ReviewService {
    @Autowired
    ReviewRepo revRepo;

    public List<Review> getReviews(){
        return revRepo.findAll();
    }

    public Review getReviewById(int id){
        return revRepo.findById(id).orElseThrow(()->new RuntimeException("Not found"));
    }

    public void addReview(Review rev){
        revRepo.save(rev);

    }

    public void updateReview(Review rev){
        revRepo.save(rev);
    }

    public void deleteReview(int id){
        revRepo.deleteById(id);
    }
}
