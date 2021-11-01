package com.infygo.service;

import java.util.List;

import com.infygo.entity.FlightDetails;

public interface FlightService {
	public List<String> getSourceDetails();

	public List<String> getDestinationDetails();

	public List<FlightDetails> getFlightsBySourceDestinationDate(String source, String dest, String date);
}
