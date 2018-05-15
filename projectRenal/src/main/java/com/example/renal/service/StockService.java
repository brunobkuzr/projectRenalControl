package com.example.renal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.renal.entity.Stock;
import com.example.renal.repository.StockRepository;

@Service
public class StockService {
	@Autowired
	private StockRepository stockRepository;

	public Stock findById(long id) {
		Stock stock = new Stock();
		stock = stockRepository.findById(id).get();
		 return stock ;
	}

	public List<Stock> findAll(){
		return stockRepository.findAll();
	}
}
