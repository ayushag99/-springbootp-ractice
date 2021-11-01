package com.infygo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infygo.entity.FlightDetails;
import com.infygo.repository.FlightRepository;

@Service
public class FlightServiceImpl implements FlightService {

	@Autowired
	private FlightRepository flightRepository;

	@Override
	public List<String> getSourceDetails() {
		// TODO Auto-generated method stub
		List<String> sources = new ArrayList<String>();
		List<FlightDetails> flightDetailsList = flightRepository.findAll();
		for (FlightDetails flightDetails : flightDetailsList) {
			sources.add(flightDetails.getSource());
		}
		return sources;

	}

	@Override
	public List<String> getDestinationDetails() {
		// TODO Auto-generated method stub
		List<String> destination = new ArrayList<String>();
		List<FlightDetails> flightDetailsList = flightRepository.findAll();
		for (FlightDetails flightDetails : flightDetailsList) {
			destination.add(flightDetails.getDestination());
		}
		return destination;
	}

	@Override
	public List<FlightDetails> getFlightsBySourceDestinationDate(String source, String dest, String date) {
		// TODO Auto-generated method stub
		return flightRepository.findBySourceAndDestinationAndFlightAvailableDate(source, dest, date);
	}

}
