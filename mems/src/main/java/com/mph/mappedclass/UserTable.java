package com.mph.mappedclass;
import javax.persistence.Embedded;
import javax.persistence.Entity;



@Entity
public class UserTable extends SuperTable {
	
	
	@Embedded
	private Name name;
	private String password;
	private String email;
	private String phoneno;
	public UserTable() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public UserTable(Name name, String password, String email, String phoneno) {
		super();
		
		this.name = name;
		this.password = password;
		this.email = email;
		this.phoneno = phoneno;
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
		return "UserTable [name=" + name + ", password=" + password + ", email=" + email
				+ ", phoneno=" + phoneno + "]";
	}

}