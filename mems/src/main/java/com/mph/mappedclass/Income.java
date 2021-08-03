package com.mph.mappedclass;


import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Income extends SuperTable{
	@OneToOne
	@JoinColumn(name = "EXPID")
	private Expense exp;
	private int amount;
	private String Source;
	public Income() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public Expense getExp() {
		return exp;
	}
	public void setExp(Expense exp) {
		this.exp = exp;
	}
	public String getSource() {
		return Source;
	}
	public void setSource(String source) {
		Source = source;
	}
	@Override
	public String toString() {
		return "Income [exp=" + exp + ", amount=" + amount + ", Source=" + Source + "]";
	}
	
}
