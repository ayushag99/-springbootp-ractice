package com.infygo.dto;

import com.infygo.entity.CreditCard;

public class CreditCardDTO {

	private String cardNumber;
	private String apin;
	private String cardHolderName;
	private String cvv;
	private String expiryMonth;
	private String expiryYear;
	private double totalBill;

	public CreditCardDTO(String cardNumber, String apin, String cardHolderName, String cvv, String expiryMonth,
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

	public CreditCardDTO() {
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

	public static CreditCard preapareCreditCardEntity(CreditCardDTO creditCardDTO) {
		CreditCard creditCard = new CreditCard();
		creditCard.setApin(creditCardDTO.getApin());
		creditCard.setCardHolderName(creditCardDTO.getCardHolderName());
		creditCard.setCardNumber(creditCardDTO.getCardNumber());
		creditCard.setCvv(creditCardDTO.getCvv());
		creditCard.setExpiryMonth(creditCardDTO.getExpiryMonth());
		creditCard.setExpiryYear(creditCardDTO.getExpiryYear());
		creditCard.setTotalBill(creditCardDTO.getTotalBill());

		return creditCard;
	}

}
