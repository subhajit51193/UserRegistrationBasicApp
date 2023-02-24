package com.demo.service;
import java.util.List;

import com.demo.exception.CustomerException;
import com.demo.model.Customer;

public interface CustomerService {
	
	public Customer registerCustomer(Customer customer);
	
	public Customer getCustomerDetailsByEmail(String email)throws CustomerException;
	
	public List<Customer> getAllCustomerDetails()throws CustomerException;

}
