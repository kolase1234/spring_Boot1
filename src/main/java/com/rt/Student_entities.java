package com.rt;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="stddata1")
public class Student_entities {
	
	@Id
	@GeneratedValue
	@Column(name="id")
	private int id;
	
	
	@Column(name="name")
	private String name;
	
	@Column(name="salary")
	private int salary;
	
	@Column(name="Address")
	private String Address;
	
	
	public Student_entities(){}

  public Student_entities(int id, String name, int salary, String address) {
	super();
	this.id = id;
	this.name = name;
	this.salary = salary;
	this.Address = address;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int getSalary() {
	return salary;
}

public void setSalary(int salary) {
	this.salary = salary;
}

public String getAddress() {
	return Address;
}

public void setAddress(String address) {
	Address = address;
}


}
