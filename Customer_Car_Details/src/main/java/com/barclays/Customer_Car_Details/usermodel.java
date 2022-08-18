package com.barclays.Customer_Car_Details;


import java.time.LocalDate;

import javax.persistence.*;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



public class usermodel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	String name;
	String emailid;
	int customer_id;
	LocalDate date_of_birth;

	
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCustomerid() {
		return customer_id;
	}

	public void setCustomerid(int customer_id ) {
		this.customer_id = customer_id;
	}
	
	public String getEmailid() {
		return emailid;
	}

	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	
	public LocalDate getDOB() {
		return date_of_birth;
	}

	public void setDOB(LocalDate date_of_birth ) {
		this.date_of_birth = date_of_birth;
	}
	


}
