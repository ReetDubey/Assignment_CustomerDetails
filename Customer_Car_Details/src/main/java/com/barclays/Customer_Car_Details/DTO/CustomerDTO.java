package com.barclays.Customer_Car_Details.DTO;

import java.time.LocalDate;
import java.util.List;

public class CustomerDTO {
	Integer customer_id;
	String emailid;
	String name;
	LocalDate date_of_birth;
	List<CardDTO> cards;
	
	public Integer getId() {
		return customer_id;
	}
	
	public void setId(Integer customer_id) {
		this.customer_id = customer_id;
	}

	public String getEmail() {
		return emailid;
	}
	
	public void setEmail(String emailid) {
		this.emailid = emailid;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public LocalDate getDob() {
		return date_of_birth;
	}
	
	public void setDob(LocalDate date_of_birth) {
		this.date_of_birth = date_of_birth;
	}

	public List<CardDTO> getCards() {
		return cards;
	}

	public void setCards(List<CardDTO> cards) {
		this.cards = cards;
	}	
}
