package com.infygo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.infygo.dto.LoginDetailsDTO;
import com.infygo.dto.UserDetailsDTO;
import com.infygo.service.AuthService;

@RestController
@RequestMapping("/")
public class AuthController {

	@Autowired
	private AuthService authService;

	@PostMapping(value = "/registration")
	public boolean registration(@RequestBody UserDetailsDTO userDetailsDTO) {
		return authService.register(userDetailsDTO);
	}

	@PostMapping(value = "/login")
	public boolean login(@RequestBody LoginDetailsDTO loginDetailsDTO) {
		return authService.login(loginDetailsDTO);
	}
}
