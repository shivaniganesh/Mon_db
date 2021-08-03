package com.mph.mems;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Exp")
public class Expense extends User{
	private String category;
	private long amount;
	private String date;
	private String description;
	public Expense() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Expense(int uid, Fullname name, String password, String email, String phoneno) {
		super(uid, name, password, email, phoneno);
		// TODO Auto-generated constructor stub
	}
	private String document;
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public long getAmount() {
		return amount;
	}
	public void setAmount(long amount) {
		this.amount = amount;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getDocument() {
		return document;
	}
	public void setDocument(String document) {
		this.document = document;
	}
	@Override
	public String toString() {
		return "Expense [category=" + category + ", amount=" + amount + ", date=" + date + ", description="
				+ description + ", document=" + document + "]";
	}

}
