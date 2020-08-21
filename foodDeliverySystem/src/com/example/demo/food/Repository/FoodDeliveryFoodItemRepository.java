package com.example.demo.food.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.food.Model.FoodItems;
@Repository
@EnableJpaRepositories
public interface FoodDeliveryFoodItemRepository extends JpaRepository<FoodItems, Integer> {

}