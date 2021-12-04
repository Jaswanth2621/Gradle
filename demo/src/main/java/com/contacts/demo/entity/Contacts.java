package com.contacts.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="contact")
public class Contacts {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="contact_id")
	private int contactid;
	@Column(name="name")
	private String name;
	@Column(name="emaill")
	private String email;
	@Column(name="place")
	private String place;
	public Contacts(int contactid, String name, String email, String place) {
		super();
		this.contactid = contactid;
		this.name = name;
		this.email = email;
		this.place = place;
	}
	public Contacts() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getContactid() {
		return contactid;
	}
	public void setContactid(int contactid) {
		this.contactid = contactid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	@Override
	public String toString() {
		return "Contacts [contactid=" + contactid + ", name=" + name + ", email=" + email + ", place=" + place + "]";
	}
	

}
