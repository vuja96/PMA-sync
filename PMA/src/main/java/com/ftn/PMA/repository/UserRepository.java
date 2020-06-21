package com.ftn.PMA.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ftn.PMA.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
