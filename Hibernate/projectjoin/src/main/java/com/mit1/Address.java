package com.mit1;

import java.util.*;
import javax.persistence.Entity; 
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;
import javax.persistence.GeneratedValue; 
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Column; 
@Entity
@Table(name="empaddress")
public class Address {
	@Id
	@Column(name = "emp_id",nullable = false)
	private long id;
	@Column(name="STREET",length=50)
	private String street;
	@Column(name="CITY",length=50)
	private String city;
	@Column(name="is_open")
	private boolean isOpen;
	@Transient
	private double x;
	@Column(name="added_name")
	@Temporal(TemporalType.DATE)
	private Date addedDate;
	@Lob
	private byte[]image;
	@OneToOne(mappedBy="address")
	private Employee employee;
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Address(long id, String street, String city, boolean isOpen, double x, Date addedDate, byte[] image,
			Employee employee) {
		super();
		this.id = id;
		this.street = street;
		this.city = city;
		this.isOpen = isOpen;
		this.x = x;
		this.addedDate = addedDate;
		this.image = image;
		this.employee = employee;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public boolean isOpen() {
		return isOpen;
	}
	public void setOpen(boolean isOpen) {
		this.isOpen = isOpen;
	}
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public Date getAddedDate() {
		return addedDate;
	}
	public void setAddedDate(Date addedDate) {
		this.addedDate = addedDate;
	}
	public byte[] getImage() {
		return image;
	}
	public void setImage(byte[] image) {
		this.image = image;
	}
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	
}