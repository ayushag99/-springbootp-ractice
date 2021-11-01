package com.infygo.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.infygo.dto.UserDetailsDTO;

@Entity
@Table(name = "user_details")
public class UserDetails {
	@Id
	@Column(name = "user_id")
	private String userId;
	private String city;
	private String email;
	private String name;
	private String password;
	private String phone;
//
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "user_id", referencedColumnName = "user_id")
	private List<TicketDetail> ticket;

	public UserDetails() {
	}

	public UserDetails(String userId, String city, String email, String name, String password, String phone) {
		super();
		this.userId = userId;
		this.city = city;
		this.email = email;
		this.name = name;
		this.password = password;
		this.phone = phone;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public static UserDetailsDTO prepareUserDetailsDTO(UserDetails userDetails) {
		UserDetailsDTO userDetailsDTO = new UserDetailsDTO();
		userDetailsDTO.setCity(userDetails.getCity());
		userDetailsDTO.setEmail(userDetails.getEmail());
		userDetailsDTO.setName(userDetails.getName());
		userDetailsDTO.setPassword(userDetails.getPassword());
		userDetailsDTO.setPhone(userDetails.getPhone());
		userDetailsDTO.setUserId(userDetails.getUserId());

		return userDetailsDTO;
	}

	@Override
	public String toString() {
		return "UserDetails [userId=" + userId + ", city=" + city + ", email=" + email + ", name=" + name
				+ ", password=" + password + ", phone=" + phone + ", ticket=" + ticket + "]";
	}

	

}
