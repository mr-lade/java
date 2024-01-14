package com.mit;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table; 
@Entity
@Table(name="empdata")
public class Employee {
@Id
private int id;
private String firstname;
private String lastname;
public Employee() {
	super();
	// TODO Auto-generated constructor stub
}
public Employee(int id, String firstname, String lastname) {
	super();
	this.id = id;
	this.firstname = firstname;
	this.lastname = lastname;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getFirstname() {
	return firstname;
}
public void setFirstname(String firstname) {
	this.firstname = firstname;
}
public String getLastname() {
	return lastname;
}
public void setLastname(String lastname) {
	this.lastname = lastname;
}

}
