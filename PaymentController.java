package com.infygo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.infygo.dto.CreditCardDTO;
import com.infygo.service.PaymentService;

@RestController
@RequestMapping("/payment")
public class PaymentController {
	@Autowired
	private PaymentService paymentService;

	@PostMapping
	public boolean payment(@RequestBody CreditCardDTO creditCardDTO) {
		return paymentService.savePaymentDetails(creditCardDTO);

	}

}
