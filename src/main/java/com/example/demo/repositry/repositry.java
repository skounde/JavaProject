package com.example.demo.repositry;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.example.demo.model.model;
@Repository
public interface repositry extends JpaRepository<model, Long>{
	
	
	
	

}
