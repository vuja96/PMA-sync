package com.ftn.PMA.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ftn.PMA.model.GroceryAndAmountPair;

public interface GroceryAndAmountPairRepository extends JpaRepository<GroceryAndAmountPair, Long> {

}
