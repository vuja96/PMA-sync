package com.ftn.PMA.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ftn.PMA.model.Activity;

public interface ActivityRepository extends JpaRepository<Activity, Long> {

}
