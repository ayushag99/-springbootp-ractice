package com.infygo.entity;

import java.sql.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "ticket_details")
public class TicketDetail {
	@Id
	private int pnr;
	@Column(name = "booking_date")
	private String bookingDate;
	@Column(name = "departure_date")
	private Date departureDate;
	@Column(name = "departure_time")
	private String departureTime;
	@Column(name = "flight_id")
	private String flightId;
	@Column(name = "no_of_seats")
	private int noOfSeats;
	@Column(name = "total_fare")
	private double totalFare;
	@Column(name = "user_id")
	private String userId;

	@OneToMany
	@JoinColumn(name = "pnr", referencedColumnName = "pnr")
	private List<Passenger> passengers;

	public TicketDetail(int pnr, String bookingDate, Date departureDate, String departureTime, String flightId,
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

	public TicketDetail() {
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

	public void setDepartureDate(Date departureDate) {
		this.departureDate = departureDate;
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

}
