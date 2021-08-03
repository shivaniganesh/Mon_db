package com.mph.mappedclass;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class SuperTable {
	@Id
	@GeneratedValue
	private int userId;

	public SuperTable() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	@Override
	public String toString() {
		return "SuperTable [userId=" + userId + "]";
	}

}
