package com.mit1;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade; 
@Entity
@Table(name="empdatajoin")
public class Employee {
@Id
private int id;
private String firstname;
private String lastname;
@OneToOne
@JoinColumn(name="add_id")
private Address address;
public Employee() {
	super();
	// TODO Auto-generated constructor stub
}
public Employee(int id, String firstname, String lastname, Address address) {
	super();
	this.id = id;
	this.firstname = firstname;
	this.lastname = lastname;
	this.address = address;
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
public Address getAddress() {
	return address;
}
public void setAddress(Address address) {
	this.address = address;
}

}
