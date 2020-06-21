package com.ftn.PMA.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ftn.PMA.model.Grocery;

public interface GroceryRepository extends JpaRepository<Grocery, Long> {

}
