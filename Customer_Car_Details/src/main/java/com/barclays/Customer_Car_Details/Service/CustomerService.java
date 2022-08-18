package com.barclays.Customer_Car_Details.Service;

import java.util.List;

import com.barclays.Customer_Car_Details.DTO.CardDTO;
import com.barclays.Customer_Car_Details.DTO.CustomerDTO;
import com.barclays.Customer_Car_Details.Exception.Exc;

public interface CustomerService {
	public CustomerDTO getCustomerDetails(Integer customerId) throws Exc;
	public Integer addCustomer(CustomerDTO customerDTO) throws Exc;
	public void issueCardToExistingCustomer(Integer customerId, CardDTO cardDTO) throws Exc;
	public void deleteCustomer(Integer customerId) throws Exc;
	public void deleteCardOfExistingCustomer(Integer customerId, List<Integer> cardIdsToDelete) throws Exc;	
		
}
