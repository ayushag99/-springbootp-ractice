package com.infygo.dto;

import com.infygo.entity.Passenger;

public class PassengerDTO {
	private String passengerName;
	private int passengerAge;
	private String passengerGender;

	/**
	 * @param passengerName
	 * @param passengerAge
	 * @param passengerGender
	 */
	public PassengerDTO() {
	}

	public PassengerDTO(String passengerName, int passengerAge, String passengerGender) {
		super();
		this.passengerName = passengerName;
		this.passengerAge = passengerAge;
		this.passengerGender = passengerGender;
	}

	public String getPassengerName() {
		return passengerName;
	}

	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}

	public int getPassengerAge() {
		return passengerAge;
	}

	public void setPassengerAge(int passengerAge) {
		this.passengerAge = passengerAge;
	}

	public String getPassengerGender() {
		return passengerGender;
	}

	public void setPassengerGender(String passengerGender) {
		this.passengerGender = passengerGender;
	}

	public static Passenger preparePassengerEntity(PassengerDTO passengerDTO) {
		Passenger passenger = new Passenger();
		passenger.setAge(passengerDTO.getPassengerAge());
		passenger.setGender(passengerDTO.getPassengerGender());
		passenger.setName(passengerDTO.getPassengerName());
		return passenger;
	}

}
