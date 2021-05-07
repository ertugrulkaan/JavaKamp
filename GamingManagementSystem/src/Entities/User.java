package Entities;

import java.sql.Date;

import Abstract.Entity;

public class User implements Entity{
	private int id;
	private String firtsName;
	private String lastName;
	private String nationalyNumber;
	private Date birthDate;
	
	public User() {
		
	}
	
	public User(int id, String firtsName, String lastName, String nationalyNumber, Date birthDate) {
		super();
		this.id = id;
		this.firtsName = firtsName;
		this.lastName = lastName;
		this.nationalyNumber = nationalyNumber;
		this.birthDate = birthDate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirtsName() {
		return firtsName;
	}

	public void setFirtsName(String firtsName) {
		this.firtsName = firtsName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getNationalyNumber() {
		return nationalyNumber;
	}

	public void setNationalyNumber(String nationalyNumber) {
		this.nationalyNumber = nationalyNumber;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
}
