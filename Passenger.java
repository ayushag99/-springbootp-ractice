package com.infygo.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "passenger_details")
public class Passenger {
	@Id
	@Column(name = "passenger_id")
	private int id;
	@Column(name = "passenger_name")
	private String name;
	@Column(name = "passenger_age")
	private int age;
	@Column(name = "passenger_gender")
	private String gender;
	

	@ManyToOne
	@JoinColumn(name = "pnr", referencedColumnName = "pnr")

	private TicketDetail ticket;

	public Passenger() {

	}

	public Passenger(int id, String name, int age, String gender, TicketDetail ticket) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.ticket = ticket;
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public TicketDetail getTicket() {
		return ticket;
	}

	public void setTicket(TicketDetail ticket) {
		this.ticket = ticket;
	}


	@Override
	public String toString() {
		return "Passenger [id=" + id + ", name=" + name + ", age=" + age + ", gender=" + gender + ", ticket=" + ticket
				+ "]";
	}

}
