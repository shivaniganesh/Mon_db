package com.mph.joinedsubclass;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("inc")
public class Income extends UserTable{
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
	public String getSource() {
		return Source;
	}
	public void setSource(String source) {
		Source = source;
	}
	@Override
	public String toString() {
		return "PartTimeEmployee [amount=" + amount + ", Source=" + Source + "]";
	}
	
}
