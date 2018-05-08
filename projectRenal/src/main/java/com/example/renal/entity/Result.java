package com.example.renal.entity;


import javax.persistence.*;




@Entity
@Table(name = "result")
public class Result {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String nmResult;
	private Double valueDefault;	
	public Double getValueDefault() {
		return valueDefault;
	}

	public void setValueDefault(Double valueDefault) {
		this.valueDefault = valueDefault;
	}


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNmResult() {
		return nmResult;
	}

	public void setNmResult(String nmResult) {
		this.nmResult = nmResult;
	}
	
		
}
