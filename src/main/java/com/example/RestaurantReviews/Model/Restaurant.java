package com.example.RestaurantReviews.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Column;
import jakarta.persistence.OneToMany;
import jakarta.persistence.CascadeType;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "restaurant")
public class Restaurant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String cusine;
    @OneToMany(mappedBy = "restaurant", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonManagedReference
    private List<Review> reviews;

    //getters and setters
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }   
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getCusine(){
        return cusine;
    }
    public void setCusine(String cusine){
        this.cusine = cusine;
    }
    public List<Review> getReviews(){
        return reviews;
    }
    public void setReviews(List<Review> reviews){
        this.reviews = reviews;
    }
    
}
