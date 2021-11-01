package com.infygo.dto;

import java.util.List;

public class PassengerListInput {
	private List<PassengerDTO> passengerList;

	/**
	 * @param passengerList
	 */
	public PassengerListInput(List<PassengerDTO> passengerList) {
		super();
		this.passengerList = passengerList;
	}

	public PassengerListInput() {

	}

	public List<PassengerDTO> getPassengerList() {
		return passengerList;
	}

	public void setPassengerList(List<PassengerDTO> passengerList) {
		this.passengerList = passengerList;
	}

}
