package com.infygo.dto;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Id;

import com.infygo.entity.FlightDetails;

public class FlightDetailsDTO {
	private String flightId;
	private String airlines;
	private String arrival_time;
	private String departure_time;
	private String destination;
	private String source;
	private int seatCount;
	private double fare;
	private String flight_available_date;

	public FlightDetailsDTO() {
	}

	public FlightDetailsDTO(String flightId, String airlines, String arrival_time, String departure_time,
			String destination, String source, int seatCount, double fare, String flight_available_date) {
		super();
		this.flightId = flightId;
		this.airlines = airlines;
		this.arrival_time = arrival_time;
		this.departure_time = departure_time;
		this.destination = destination;
		this.source = source;
		this.seatCount = seatCount;
		this.fare = fare;
		this.flight_available_date = flight_available_date;
	}

	public String getFlightId() {
		return flightId;
	}

	public void setFlightId(String flightId) {
		this.flightId = flightId;
	}

	public String getAirlines() {
		return airlines;
	}

	public void setAirlines(String airlines) {
		airlines = airlines;
	}

	public String getArrival_time() {
		return arrival_time;
	}

	public void setArrival_time(String arrival_time) {
		this.arrival_time = arrival_time;
	}

	public String getDeparture_time() {
		return departure_time;
	}

	public void setDeparture_time(String departure_time) {
		this.departure_time = departure_time;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public int getSeatCount() {
		return seatCount;
	}

	public void setSeatCount(int seatCount) {
		this.seatCount = seatCount;
	}

	public double getFare() {
		return fare;
	}

	public void setFare(double fare) {
		this.fare = fare;
	}

	public String getFlight_available_date() {
		return flight_available_date;
	}

	public void setFlight_available_date(String flight_available_date) {
		this.flight_available_date = flight_available_date;
	}

	public static FlightDetails prepareFlightDetailsEntity(FlightDetailsDTO flightDetailsDTO) {
		FlightDetails flightDetails = new FlightDetails();

		flightDetails.setAirlines(flightDetailsDTO.getAirlines());
		flightDetails.setArrival_time(flightDetailsDTO.getArrival_time());
		flightDetails.setDeparture_time(flightDetailsDTO.getDeparture_time());
		flightDetails.setDestination(flightDetailsDTO.getDestination());
		flightDetails.setFare(flightDetailsDTO.getFare());
		flightDetails.setFlightAvailableDate(flightDetailsDTO.getFlight_available_date());
		flightDetails.setFlightId(flightDetailsDTO.getFlightId());
		flightDetails.setSeatCount(flightDetailsDTO.getSeatCount());
		flightDetails.setSource(flightDetailsDTO.getSource());

		return flightDetails;
	}
}
