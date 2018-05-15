package com.example.renal.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.renal.entity.TestResults;

public interface TestResultsRepository extends JpaRepository<TestResults, Long>{

}
