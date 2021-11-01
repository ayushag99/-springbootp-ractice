package com.infygo.service;

import java.lang.StackWalker.Option;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infygo.dto.LoginDetailsDTO;
import com.infygo.dto.UserDetailsDTO;
import com.infygo.entity.UserDetails;
import com.infygo.repository.UserDetailsRepository;

@Service
public class AuthServiceImpl implements AuthService {

	@Autowired
	private UserDetailsRepository userDetailsRepository;

	@Override
	public boolean register(UserDetailsDTO userDetailsDTO) {
		// TODO Auto-generated method stub
		UserDetails userDetails = userDetailsDTO.prepareUserDetailsEntity(userDetailsDTO);

		UserDetails userDetails2 = userDetailsRepository.saveAndFlush(userDetails);
		if (userDetails != null)
			return true;
		else
			return false;

	}

	@Override
	public boolean login(LoginDetailsDTO loginDetailsDTO) {
		// TODO Auto-generated method stub
		Optional<UserDetails> optionalUserDetails = userDetailsRepository.findById(loginDetailsDTO.getUserId());
		try {
			UserDetails userDetails = optionalUserDetails.get();

			System.out.println("Login With Cred " + userDetails.toString());
			if (userDetails != null && userDetails.getPassword().equals(loginDetailsDTO.getPassword())) {
				return true;
			} else {
				throw new Exception("Incorrect Password");
			}

		} catch (Exception e) {
			return false;
		}

	}

}
