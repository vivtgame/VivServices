package com.greendotcorp.vivtest.controller;

import java.util.ArrayList;
import java.util.List;
import com.greendotcorp.vivtest.bean.Customer;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {
	
	//http://localhost:8082/VivRestfulService/customers
	@RequestMapping(value = "/customers", method = RequestMethod.GET,headers="Accept=application/json")
	public List<Customer> getCustomers()
	{
		List<Customer> listOfCustomers = new ArrayList<Customer>();
		listOfCustomers=createCustomerList();
		return listOfCustomers;
	}

	@RequestMapping(value = "/customer/{id}", method = RequestMethod.GET,headers="Accept=application/json")
	public Customer getCustomerById(@PathVariable int id)
	{
		List<Customer> listOfCustomers = new ArrayList<Customer>();
		listOfCustomers=createCustomerList();

		for (Customer customer: listOfCustomers) {
			if(customer.getId()==id)
				return customer;
		}
		
		return null;
	}
	
	@RequestMapping(value = "/addcustomer", method = RequestMethod.POST,headers="Accept=application/json")
	public Customer setCustomer(@RequestBody Customer customer)
	{
		return new Customer(customer.getId(), customer.getCustomerName());
	}

// Utiliy method to create customer list.
	public List<Customer> createCustomerList()
	{
		List<Customer> listOfCustomers = new ArrayList<Customer>();
		listOfCustomers.add(new Customer(1, "Vivian Wu"));
		listOfCustomers.add(new Customer(2, "Jacquline Su"));
		listOfCustomers.add(new Customer(3, "Alice Yin"));
		listOfCustomers.add(new Customer(4, "Tony Wei"));
		listOfCustomers.add(new Customer(5, "Dana Chen"));
		listOfCustomers.add(new Customer(6, "Hui Li"));
		listOfCustomers.add(new Customer(7, "Lynn Lin"));
		listOfCustomers.add(new Customer(8, "Michel Li"));
		listOfCustomers.add(new Customer(9, "Mark Sun"));
		return listOfCustomers;
	}
}
