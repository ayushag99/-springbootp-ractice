package com.infygo.service;

import com.infygo.dto.PassengerListInput;

public interface BookingService {
	public void bookFlight(String flightId, String userId, PassengerListInput passengerListInput);
}
//