package com.infygo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.infygo.dto.FlightDetailsDTO;

@Entity
@Table(name = "flight_details")
public class FlightDetails {
	@Id
	@Column(name = "flight_id")
	private String flightId;
	private String airlines;
	private String arrival_time;
	private String departure_time;
	private String destination;
	private String source;
	@Column(name = "seat_count")
	private int seatCount;
	private double fare;
	private String flightAvailableDate;

	public FlightDetails() {
	}

	public FlightDetails(String flightId, String airlines, String arrival_time, String departure_time,
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
		this.flightAvailableDate = flight_available_date;
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

	public String getFlightAvailableDate() {
		return flightAvailableDate;
	}

	public void setFlightAvailableDate(String flight_available_date) {
		this.flightAvailableDate = flight_available_date;
	}

	public static FlightDetailsDTO prepareFlightDetailsDTO(FlightDetails flightDetails) {
		FlightDetailsDTO flightDetailsDTO = new FlightDetailsDTO();

		flightDetailsDTO.setAirlines(flightDetails.getAirlines());
		flightDetailsDTO.setArrival_time(flightDetails.getArrival_time());
		flightDetailsDTO.setDeparture_time(flightDetails.getDeparture_time());
		flightDetailsDTO.setDestination(flightDetails.getDestination());
		flightDetailsDTO.setFare(flightDetails.getFare());
		flightDetailsDTO.setFlight_available_date(flightDetails.getFlightAvailableDate());
		flightDetailsDTO.setFlightId(flightDetails.getFlightId());
		flightDetailsDTO.setSeatCount(flightDetails.getSeatCount());
		flightDetailsDTO.setSource(flightDetails.getSource());

		return flightDetailsDTO;
	}

}
