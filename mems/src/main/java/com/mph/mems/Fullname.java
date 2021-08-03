package com.mph.mems;

import javax.persistence.Embeddable;

@Embeddable
public class Fullname {
	
 private String fname;
 private String lname;
public Fullname(String fname, String lname) {
	super();
	this.fname = fname;
	this.lname = lname;
}
public Fullname() {
	super();
	// TODO Auto-generated constructor stub
}
public String getFname() {
	return fname;
}
public void setFname(String fname) {
	this.fname = fname;
}
public String getLname() {
	return lname;
}
public void setLname(String lname) {
	this.lname = lname;
}
@Override
public String toString() {
	return "Fullname [fname=" + fname + ", lname=" + lname + "]";
}
}
