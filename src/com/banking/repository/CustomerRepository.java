package com.banking.repository;

import com.banking.model.Customer;

import java.util.ArrayList;
import java.util.List;
public class CustomerRepository {
	private List<Customer> customers = new ArrayList<>();
	
	public void addCustomers(Customer customer) {
		customers.add(customer);)
	}
	
	public List<Customer> displayAllCustomers(){
		return customers;
	}
}
