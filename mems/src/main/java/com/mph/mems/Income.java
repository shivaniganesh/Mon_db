package com.mph.mems;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Inc")
public class Income {
	public Income() {
		super();
		// TODO Auto-generated constructor stub
	}
	
private long amount;

private String source;

public Income(long amount, String source) {
	super();
	this.amount = amount;
	this.source = source;
}

public long getAmount() {
	return amount;
}

public void setAmount(long amount) {
	this.amount = amount;
}

public String getSource() {
	return source;
}

public void setSource(String source) {
	this.source = source;
}

@Override
public String toString() {
	return "Income [amount=" + amount + ", source=" + source + "]";
}

}
