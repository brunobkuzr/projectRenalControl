package com.example.renal.entity;


import javax.persistence.*;





@Entity
@Table(name = "medicine")
public class Medicine {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String nmMedicine;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNmMedicine() {
		return nmMedicine;
	}
	public void setNmMedicine(String nmMedicine) {
		this.nmMedicine = nmMedicine;
	}
	
	
}
