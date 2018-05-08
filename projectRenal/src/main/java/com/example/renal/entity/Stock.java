package com.example.renal.entity;

import java.util.List;
import javax.persistence.*;




@Entity
@Table(name = "stock")
public class Stock {
	@Id
	private Long id;
	private Long idMedicine;
	private Long idUser;
	private Long amount;
	public Long getAmount() {
		return amount;
	}

	public void setAmount(Long amount) {
		this.amount = amount;
	}

	public Long getIdMedicine() {
		return idMedicine;
	}

	public void setIdMedicine(Long idMedicine) {
		this.idMedicine = idMedicine;
	}

	public Long getIdUser() {
		return idUser;
	}

	public void setIdUser(Long idUser) {
		this.idUser = idUser;
	}

	public Double getAmountMedicine() {
		return amountMedicine;
	}

	public void setAmountMedicine(Double amountMedicine) {
		this.amountMedicine = amountMedicine;
	}

	private Double amountMedicine;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@ManyToMany
	private List<Medicine> medicines;

}
