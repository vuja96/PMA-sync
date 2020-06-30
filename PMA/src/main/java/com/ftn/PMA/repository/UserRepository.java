package com.ftn.PMA.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.ftn.PMA.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

	@Query("select u from User u where u.email = :email")
	public List<User> findOneByEmail(@Param("email")String email);
	
}
