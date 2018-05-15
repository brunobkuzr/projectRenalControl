package com.example.renal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.renal.entity.Result;
import com.example.renal.repository.ResultRepository;

@Service
public class ResultService {
	
	@Autowired
	private ResultRepository resultRepository;

	public Result findById(long id) {
		Result result = new Result();
		result = resultRepository.findById(id).get();
		 return result ;
	}

	public List<Result> findAll(){
		return resultRepository.findAll();
	}
	

}
