package com.example.renal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.renal.entity.Exam;
import com.example.renal.repository.ExamRepository;

@Service
public class ExamService {
	@Autowired
	private ExamRepository examRepository;

	public Exam findById(long id) {
		Exam exam = new Exam();
		exam = examRepository.findById(id).get();
		 return exam ;
	}

	public List<Exam> findAll(){
		return examRepository.findAll();
	}
}
