package com.ftn.PMA.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ftn.PMA.model.DailySummary;

public interface DailySummaryRepository extends JpaRepository<DailySummary, Long> {

}
