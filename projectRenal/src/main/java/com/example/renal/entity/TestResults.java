package com.example.renal.entity;



import javax.persistence.*;



@Entity
@Table(name = "test_results")
public class TestResults {
	
	@Id
	private Long id;
	
	private int idResult;
	private Double value;
	
	private int idExam;
	
	public int getIdExam() {
		return idExam;
	}

	public void setIdExam(int idExam) {
		this.idExam = idExam;
	}

	private double valueTest;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}


	public int getIdResult() {
		return idResult;
	}

	public void setIdResult(int idResult) {
		this.idResult = idResult;
	}

	public Double getValue() {
		return value;
	}

	public void setValue(Double value) {
		this.value = value;
	}

	public double getValueTest() {
		return valueTest;
	}

	public void setValueTest(double valueTest) {
		this.valueTest = valueTest;
	}
	
	

}
