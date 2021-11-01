package com.infygo.service;

import com.infygo.dto.CreditCardDTO;

public interface PaymentService {
	public boolean savePaymentDetails(CreditCardDTO creditCardDTO);
}
