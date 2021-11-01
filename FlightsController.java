package com.infygo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.infygo.entity.FlightDetails;
import com.infygo.service.FlightService;

@RestController
@RequestMapping("/flights")
public class FlightsController {

	@Autowired
	private FlightService flightService;

	@GetMapping(value = "/sources")
	public List<String> getSourceDetails() {

		return flightService.getSourceDetails();
	}

	@GetMapping(value = "/destinations")
	public List<String> getDestinationDetails() {
		return flightService.getDestinationDetails();
	}

	@GetMapping(value = "/{source}/{destination}/{date}")
	public List<FlightDetails> flightSearch(@PathVariable("source") String source,
			@PathVariable("destination") String destination, @PathVariable("date") String date) {
		return flightService.getFlightsBySourceDestinationDate(source, destination, date);
	}
}
