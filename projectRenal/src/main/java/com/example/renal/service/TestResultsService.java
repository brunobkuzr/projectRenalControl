package com.example.renal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.renal.entity.TestResults;
import com.example.renal.repository.TestResultsRepository;

@Service
public class TestResultsService {
	@Autowired
	private TestResultsRepository testResultsRepository;

	public TestResults findById(long id) {
		TestResults testResults = new TestResults();
		testResults= testResultsRepository.findById(id).get();
		 return testResults ;
	}
	

	public List<TestResults> findAll(){
		return testResultsRepository.findAll();
	}

}
