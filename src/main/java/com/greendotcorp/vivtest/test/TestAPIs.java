package com.greendotcorp.vivtest.test;

import org.testng.annotations.Test;

import com.greendotcorp.vivtest.bean.Customer;
import com.greendotcorp.vivtest.controller.CustomerController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.Assert;
import org.testng.annotations.Test;

@Test
@ContextConfiguration(locations = { "classpath:test-config.xml" })
public class TestAPIs extends AbstractTestNGSpringContextTests {

	@Autowired
	CustomerController customerController;

	@Test()
	void testGetCustomers() {

		List<Customer> customerLst = customerController.getCustomers();

		Assert.assertNotNull(customerLst);
		Assert.assertEquals(customerLst.size(), 9);
		

	}

}