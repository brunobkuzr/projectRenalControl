package com.example.renal.entity;

import java.util.List;
import javax.persistence.*;





@Entity
@Table(name = "period")
public class Period {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String nmPeriod;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNmPeriod() {
		return nmPeriod;
	}

	public void setNmPeriod(String nmPeriod) {
		this.nmPeriod = nmPeriod;
	}

	@ManyToMany
	private List<Medicine> medicines;

}
