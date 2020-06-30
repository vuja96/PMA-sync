package com.ftn.PMA.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.ftn.PMA.model.ActivityType;

public interface ActivityTypeRepository extends JpaRepository<ActivityType, Long>{

	@Query("select at from ActivityType at where at.id = :id")
	public ActivityType findOneById(@Param("id")long id);
	
}
