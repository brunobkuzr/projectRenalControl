package com.example.renal.entity;


import javax.persistence.*;



@Entity
@Table(name = "exam")
public class Exam {

	@Id
	private Long id;
	private int dtExam;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public int getDtExam() {
		return dtExam;
	}
	public void setDtExam(int dtExam) {
		this.dtExam = dtExam;
	}
		
}
