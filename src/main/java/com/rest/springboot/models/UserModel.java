package com.rest.springboot.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity //tells Hibernate to make a table by using this class
@Table(name= "user")
public class UserModel {
	
    @Id //this makes id as the primary key of the table 
    @GeneratedValue(strategy=GenerationType.AUTO) //auto incrementing the id
    @Column(name="user_id")
	private Integer id;
    
    @Column(name="first_name")
	private String firstname;
    
    @Column(name="last_name")
	private String lastname;
	
    @Column(name="email")
    private String email;
    
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
		
}
