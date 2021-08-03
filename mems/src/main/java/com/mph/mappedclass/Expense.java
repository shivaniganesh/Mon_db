package com.mph.mappedclass;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Ex")
public class Expense extends SuperTable {
	private int amount;
	private String category;
	private String description;
	private String expDate;
	
	

	public Expense() {
		super();
		// TODO Auto-generated constructor stub
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

	@Override
	public String toString() {
		return "Expense [amount=" + amount + ", category=" + category + ", description=" + description + ", expDate="
				+ expDate + "]";
	}
	

}
