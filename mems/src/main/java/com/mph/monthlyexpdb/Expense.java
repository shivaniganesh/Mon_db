package com.mph.monthlyexpdb;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Expense  {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int expId;
	@ManyToOne
	@JoinColumn(name = "incomeId",referencedColumnName = "userID")
	private Income income;
	private int amount;
	private String category;
	private String description;
	private String expDate;
	
	

	public Expense() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public int getExpId() {
		return expId;
	}



	public void setExpId(int expId) {
		this.expId = expId;
	}



	public int getAmount() {
		return amount;
	}



	public void setAmount(int amount) {
		this.amount = amount;
	}



	public String getCategory() {
		return category;
	}



	public void setCategory(String category) {
		this.category = category;
	}



	public String getDescription() {
		return description;
	}



	public void setDescription(String description) {
		this.description = description;
	}



	public String getExpDate() {
		return expDate;
	}



	public void setExpDate(String expDate) {
		this.expDate = expDate;
	}



	public Income getIncome() {
		return income;
	}



	public void setIncome(Income income) {
		this.income = income;
	}



	@Override
	public String toString() {
		return "Expense [expId=" + expId + ", income=" + income + ", amount=" + amount + ", category=" + category
				+ ", description=" + description + ", expDate=" + expDate + "]";
	}



	



	
	

}
