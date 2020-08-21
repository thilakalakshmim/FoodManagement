package com.example.demo.food.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.food.Model.customer;

public interface customerRepository  extends JpaRepository<customer, Integer>{

	customer save(customer customer);

	void deleteById(int id);

	Optional<customer> findById(int id);

}
