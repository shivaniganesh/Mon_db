package com.mph.mems;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "EMP_TYPE")
@Entity
public class User {
	public User(int uid, Fullname name, String password, String email, String phoneno) {
		super();
		this.uid = uid;
		this.name = name;
		this.password = password;
		this.email = email;
		this.phoneno = phoneno;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Id
	@GeneratedValue
	private int uid;
	@Embedded
	private Fullname name;
	private String password;
	private String email;
	private String phoneno;
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public Fullname getName() {
		return name;
	}
	public void setName(Fullname name) {
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
		return "User [uid=" + uid + ", name=" + name + ", password=" + password + ", email=" + email + ", phoneno="
				+ phoneno + "]";
	}
	
	
}
