package com.infygo.service;

import com.infygo.dto.LoginDetailsDTO;
import com.infygo.dto.UserDetailsDTO;

public interface AuthService {
	public boolean register(UserDetailsDTO userDetailsDTO);

	public boolean login(LoginDetailsDTO loginDetailsDTO);
}
