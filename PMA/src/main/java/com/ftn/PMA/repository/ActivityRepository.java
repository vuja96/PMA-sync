package com.ftn.PMA.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ftn.PMA.model.Activity;
import com.ftn.PMA.model.ActivityType;

public interface ActivityRepository extends JpaRepository<Activity, Long> {
	
}
