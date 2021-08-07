package com.mph.monthlyexpdb;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Income extends SuperTable{
	
	@OneToMany(mappedBy="income", cascade = CascadeType.ALL)
	private List<Expense> expense;
	private int amount;
	private int budget;
	private String Source;
	public Income() {
		super();
		// TODO Auto-generated constructor stub
	}

	public List<Expense> getExpense() {
		return expense;
	}
	public void setExpense(List<Expense> expense) {
		this.expense = expense;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public int getBudget() {
		return budget;
	}
	public void setBudget(int budget) {
		this.budget = budget;
	}
	public String getSource() {
		return Source;
	}
	public void setSource(String source) {
		Source = source;
	}
	@Override
	public String toString() {
		return "Income [ expense=" + expense + ", amount=" + amount + ", budget=" + budget
				+ ", Source=" + Source + "]";
	}
	

	
	
}
