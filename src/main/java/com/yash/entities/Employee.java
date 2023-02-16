package com.yash.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "employees")
public class Employee {
	@Id
	private int id;
	private String name;
	private String contact;
	private String gender;

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

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(String name, String contact, String gender) {
		super();
		this.name = name;
		this.contact = contact;
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", contact=" + contact + ", gender=" + gender + "]";
	}

}
