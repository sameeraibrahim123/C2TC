package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.entities.College;



public interface CollegeRepository extends JpaRepository<College, Integer> {

}
