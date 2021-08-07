package com.mph.mappedclass;


import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Income extends SuperTable{
	
	private int budget;
	private int amount;
	private String Source;
	public Income() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public int getBudget() {
		return budget;
	}

	public void setBudget(int budget) {
		this.budget = budget;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public String getSource() {
		return Source;
	}

	public void setSource(String source) {
		Source = source;
	}

	@Override
	public String toString() {
		return "Income [budget=" + budget + ", amount=" + amount + ", Source=" + Source + "]";
	}
	
}
