package com.barclays.Customer_Car_Details.repository;

import org.springframework.data.repository.CrudRepository;

import com.barclays.Customer_Car_Details.usermodel;

/**
 * CustomerRepository - Interface for customer table in database
 *
 */
public interface Customerrepo extends CrudRepository<usermodel, Integer> {
	
}
