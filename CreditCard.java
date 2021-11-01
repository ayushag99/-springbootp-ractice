package com.infygo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "creditcard_details")
public class CreditCard {
	@Id
	@Column(name = "card_number")
	private String cardNumber;
	@Column(name = "apin")
	private String apin;
	@Column(name = "card_holder_name")
	private String cardHolderName;
	@Column(name = "cvv")
	private String cvv;
	@Column(name = "expiry_month")
	private String expiryMonth;
	@Column(name = "expiry_year")
	private String expiryYear;
	@Column(name = "total_bill")
	private double totalBill;

	public CreditCard(String cardNumber, String apin, String cardHolderName, String cvv, String expiryMonth,
			String expiryYear, double totalBill) {
		super();
		this.cardNumber = cardNumber;
		this.apin = apin;
		this.cardHolderName = cardHolderName;
		this.cvv = cvv;
		this.expiryMonth = expiryMonth;
		this.expiryYear = expiryYear;
		this.totalBill = totalBill;
	}

	public CreditCard() {
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public String getApin() {
		return apin;
	}

	public void setApin(String apin) {
		this.apin = apin;
	}

	public String getCardHolderName() {
		return cardHolderName;
	}

	public void setCardHolderName(String cardHolderName) {
		this.cardHolderName = cardHolderName;
	}

	public String getCvv() {
		return cvv;
	}

	public void setCvv(String cvv) {
		this.cvv = cvv;
	}

	public String getExpiryMonth() {
		return expiryMonth;
	}

	public void setExpiryMonth(String expiryMonth) {
		this.expiryMonth = expiryMonth;
	}

	public String getExpiryYear() {
		return expiryYear;
	}

	public void setExpiryYear(String expiryYear) {
		this.expiryYear = expiryYear;
	}

	public double getTotalBill() {
		return totalBill;
	}

	public void setTotalBill(double totalBill) {
		this.totalBill = totalBill;
	}

	@Override
	public String toString() {
		return "CreditCard [cardNumber=" + cardNumber + ", apin=" + apin + ", cardHolderName=" + cardHolderName
				+ ", cvv=" + cvv + ", expiryMonth=" + expiryMonth + ", expiryYear=" + expiryYear + ", totalBill="
				+ totalBill + "]";
	}
	
//	public static void prepat

}
