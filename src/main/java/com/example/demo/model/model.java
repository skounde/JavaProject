package com.example.demo.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="crud")
public class model {
	


	@Id
	@GeneratedValue(strategy=GenerationType.AUTO	)
	
	@Column(name="id")
	private long id;
	
	@Column(name="first_name")
	private String firstName;
	
	@Column(name="last_name")
	private String lastName;
	
	@Column(name="Mobile")
	private String mobile;
	
	@Column(name="City")
	private String city;
	
	@Override
	public String toString() {
		return "model [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", mobile=" + mobile + ",City=" + city + "]";
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getMobile() {
		return mobile;
	}


	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}
	

}
