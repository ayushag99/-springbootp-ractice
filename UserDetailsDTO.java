package com.infygo.dto;

import com.infygo.entity.UserDetails;

public class UserDetailsDTO {
	private String userId;
	private String city;
	private String email;
	private String name;
	private String password;
	private String phone;


	public UserDetailsDTO() {
		// TODO Auto-generated constructor stub
	}

	public UserDetailsDTO(String userId, String city, String email, String name, String password, String phone) {
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

	public static UserDetails prepareUserDetailsEntity(UserDetailsDTO userDetailsDTO) {
		UserDetails userDetails = new UserDetails();
		userDetails.setCity(userDetailsDTO.getCity());
		userDetails.setEmail(userDetailsDTO.getEmail());
		userDetails.setName(userDetailsDTO.getName());
		userDetails.setPassword(userDetailsDTO.getPassword());
		userDetails.setPhone(userDetailsDTO.getPhone());
		userDetails.setUserId(userDetailsDTO.getUserId());

		return userDetails;
	}
}
