package com.example.renal.repository;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.renal.entity.User;

public interface UserRepository extends JpaRepository<User, Long>{

	Optional<User> findById(Long id);
	
}
