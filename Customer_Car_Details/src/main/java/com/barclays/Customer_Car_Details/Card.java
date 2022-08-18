package com.barclays.Customer_Car_Details;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * Card - Card Entity mapped to Card table in database
 */
@Entity
public class Card {
	@Id
	Integer cardId;
	String cardNumber;
	LocalDate expiryDate;
	
	@ManyToOne
	@JoinColumn(name = "cust_id", unique = true)
	usermodel user;

	public Integer getCardId() {
		return cardId;
	}

	public void setCardId(Integer cardId) {
		this.cardId = cardId;
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public LocalDate getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(LocalDate expiryDate) {
		this.expiryDate = expiryDate;
	}

	public usermodel getusermodel() {
		return user;
	}

	public void setusermodel(usermodel user) {
		this.user = user;
	}
}

