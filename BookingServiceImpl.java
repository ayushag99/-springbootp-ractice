package com.infygo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infygo.dto.PassengerDTO;
import com.infygo.dto.PassengerListInput;
import com.infygo.dto.TicketDetailDTO;
import com.infygo.entity.FlightDetails;
import com.infygo.entity.Passenger;
import com.infygo.entity.TicketDetail;
import com.infygo.repository.FlightRepository;
import com.infygo.repository.PassengerRepository;
import com.infygo.repository.TicketRepository;

@Service
public class BookingServiceImpl implements BookingService {

	@Autowired
	private PassengerRepository passengerRepository;
	@Autowired
	private TicketRepository ticketRepository;
	@Autowired
	private FlightRepository flightRepository;

	@Override
	public void bookFlight(String flightId, String userId, PassengerListInput passengerListInput) {
		// TODO Auto-generated method stub

		FlightDetails flight = flightRepository.getById(flightId);

		TicketDetailDTO ticket = new TicketDetailDTO();
		ticket.setUserId(userId);
		ticket.setFlightId(flightId);
		ticket.setNoOfSeats(passengerListInput.getPassengerList().size());
		ticket.setTotalFare(flight.getFare() * passengerListInput.getPassengerList().size());
		ticket.setDepartureTime(flight.getDeparture_time());
//		ticket.setDepartureDate(new SimpleDateFormat("yyyy-MM-dd").parse(flight.getFlightAvailableDate()));
//		ticket.setBookingDate( DateTimeFormatter.ofPattern("yyyy-MM-dd").format(LocalDateTime.now()));

		TicketDetail ticketSaved = ticketRepository.saveAndFlush(TicketDetailDTO.prepareTicketDetailEntity(ticket));

//		TicketDetail ticketDetail = TicketDetailDTO.prepareTicketDetailEntity(ticket);
		List<Passenger> passengers = new ArrayList<Passenger>();
		for (PassengerDTO passengerDTO : passengerListInput.getPassengerList()) {
			Passenger passenger = PassengerDTO.preparePassengerEntity(passengerDTO);
			passenger.setTicket(ticketSaved);
			passengerRepository.save(passenger);
		}
//		passengerRepository.flush();
//		passengerRepository.saveAllAndFlush(passengers);
		return;

	}

}
