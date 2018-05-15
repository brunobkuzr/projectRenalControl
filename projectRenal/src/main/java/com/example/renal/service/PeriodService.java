package com.example.renal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.renal.entity.Period;
import com.example.renal.repository.PeriodRepository;

@Service
public class PeriodService {
	
	@Autowired
	private PeriodRepository periodRepository;

	public Period findById(long id) {
		Period period = new Period();
		period = periodRepository.findById(id).get();
		 return period ;
	}

	public List<Period> findAll(){
		return periodRepository.findAll();
	}

}
