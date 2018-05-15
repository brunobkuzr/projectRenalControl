package com.example.renal.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.renal.entity.Medicine;


public interface MedicineRepository extends JpaRepository<Medicine, Long>{

}
