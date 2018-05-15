package com.example.renal.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.renal.entity.Exam;

public interface ExamRepository extends JpaRepository<Exam, Long>{

}
