package com.example.renal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.renal.entity.Medicine;
import com.example.renal.repository.MedicineRepository;

@Service
public class MedicineService {
	@Autowired
	private MedicineRepository medicineRepository;

	public Medicine findById(long id) {
		Medicine medicine = new Medicine();
		medicine = medicineRepository.findById(id).get();
		 return medicine ;
	}

	public List<Medicine> findAll(){
		return medicineRepository.findAll();
	}
	

}
