package com.infygo.dto;

public class LoginDetailsDTO {
	private String userId;
	private String password;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public LoginDetailsDTO(String userId, String password) {
		super();
		this.userId = userId;
		this.password = password;
	}

	public LoginDetailsDTO() {
	}

	@Override
	public String toString() {
		return "LoginDetailsDTO [userId=" + userId + ", password=" + password + "]";
	}

}
