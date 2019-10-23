package com.coderef.delivery.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coderef.delivery.model.Authority;

public interface AuthorityRepository extends JpaRepository<Authority, String>{
	
	List<Authority> findByName(String name);
	
}