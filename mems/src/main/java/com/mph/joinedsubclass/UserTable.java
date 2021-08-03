package com.mph.joinedsubclass;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;


@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "TYPE")
@Entity
public class UserTable {
	@Id
	private int userId;

	@Column
	private Name name;
	private String password;
	private String email;
	private String phoneno;
	public UserTable() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public UserTable(int userId, Name name, String password, String email, String phoneno) {
		super();
		this.userId = userId;
		this.name = name;
		this.password = password;
		this.email = email;
		this.phoneno = phoneno;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public Name getName() {
		return name;
	}

	public void setName(Name name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneno() {
		return phoneno;
	}

	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}



	@Override
	public String toString() {
		return "UserTable [userId=" + userId + ", name=" + name + ", password=" + password + ", email=" + email
				+ ", phoneno=" + phoneno + "]";
	}

}