package com.example.renal.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.renal.entity.Stock;

public interface StockRepository extends JpaRepository<Stock, Long>{

}
