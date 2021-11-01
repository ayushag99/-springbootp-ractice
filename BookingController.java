package com.infygo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.infygo.dto.PassengerListInput;
import com.infygo.service.BookingService;

@RestController
@RequestMapping("/book")
public class BookingController {

	@Autowired
	private BookingService bookingService;

	@PostMapping(value = "/{flightId}/{userId}")
	public String flightBooking(@PathVariable("flightId") String flightId, @PathVariable("userId") String userId,
			@RequestBody PassengerListInput passengerListInput) {
		bookingService.bookFlight(flightId, userId, passengerListInput);
		return "Text";
	}
}