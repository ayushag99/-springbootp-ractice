package com.infygo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infygo.dto.CreditCardDTO;
import com.infygo.repository.CreditCardRepository;

@Service
public class PaymentServiceImpl implements PaymentService {

	@Autowired
	private CreditCardRepository creditCardRepository;

	@Override
	public boolean savePaymentDetails(CreditCardDTO creditCardDTO) {
		try {
			creditCardRepository.saveAndFlush(CreditCardDTO.preapareCreditCardEntity(creditCardDTO));
			return true;
		} catch (Exception e) {
			return false;
		}

	}

}
