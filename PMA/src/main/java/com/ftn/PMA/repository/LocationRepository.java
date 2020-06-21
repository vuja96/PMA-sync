package com.ftn.PMA.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ftn.PMA.model.Location;

public interface LocationRepository extends JpaRepository<Location, Long> {

}
