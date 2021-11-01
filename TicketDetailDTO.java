package com.infygo.dto;

import java.sql.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import com.infygo.entity.Passenger;
import com.infygo.entity.TicketDetail;

public class TicketDetailDTO {

	private int pnr;
	private String bookingDate;
	private Date departureDate;
	private String departureTime;
	private String flightId;
	private int noOfSeats;
	private double totalFare;
	private String userId;

	public TicketDetailDTO(int pnr, String bookingDate, Date departureDate, String departureTime, String flightId,
			int noOfSeats, double totalFare, String userId) {
		super();
		this.pnr = pnr;
		this.bookingDate = bookingDate;
		this.departureDate = departureDate;
		this.departureTime = departureTime;
		this.flightId = flightId;
		this.noOfSeats = noOfSeats;
		this.totalFare = totalFare;
		this.userId = userId;
	}

	public TicketDetailDTO() {
	}

	public int getPnr() {
		return pnr;
	}

	public void setPnr(int pnr) {
		this.pnr = pnr;
	}

	public String getBookingDate() {
		return bookingDate;
	}

	public void setBookingDate(String string) {
		this.bookingDate = string;
	}

	public Date getDepartureDate() {
		return departureDate;
	}

	public void setDepartureDate(java.util.Date date) {
		this.departureDate = (Date) date;
	}

	public String getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(String departureTime) {
		this.departureTime = departureTime;
	}

	public String getFlightId() {
		return flightId;
	}

	public void setFlightId(String flightId) {
		this.flightId = flightId;
	}

	public int getNoOfSeats() {
		return noOfSeats;
	}

	public void setNoOfSeats(int noOfSeats) {
		this.noOfSeats = noOfSeats;
	}

	public double getTotalFare() {
		return totalFare;
	}

	public void setTotalFare(double totalFare) {
		this.totalFare = totalFare;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	@Override
	public String toString() {
		return "TicketDetail [pnr=" + pnr + ", bookingDate=" + bookingDate + ", departureDate=" + departureDate
				+ ", departureTime=" + departureTime + ", flightId=" + flightId + ", noOfSeats=" + noOfSeats
				+ ", totalFare=" + totalFare + ", userId=" + userId + "]";
	}

	public static TicketDetail prepareTicketDetailEntity(TicketDetailDTO ticketDetailDTO) {
		TicketDetail ticketDetail = new TicketDetail();
		ticketDetail.setBookingDate(ticketDetailDTO.getBookingDate());
		ticketDetail.setDepartureDate(ticketDetailDTO.getDepartureDate());
		ticketDetail.setDepartureTime(ticketDetailDTO.getDepartureTime());
		ticketDetail.setFlightId(ticketDetailDTO.getFlightId());
		ticketDetail.setNoOfSeats(ticketDetailDTO.getNoOfSeats());
		ticketDetail.setPnr(ticketDetailDTO.getPnr());
		ticketDetail.setTotalFare(ticketDetailDTO.getTotalFare());
		ticketDetail.setUserId(ticketDetailDTO.getUserId());

		return ticketDetail;
	}
}
