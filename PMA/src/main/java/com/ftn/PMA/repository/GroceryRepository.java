package com.ftn.PMA.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.ftn.PMA.model.Grocery;

public interface GroceryRepository extends JpaRepository<Grocery, Long> {
	
	@Query("select g from Grocery g where g.userEmail = :userEmail and g.id = :id")
	public Grocery findGroceryByUserAndId(@Param("userEmail") String userEmail, @Param("id") long id);	
	
}
