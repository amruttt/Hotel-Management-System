package com.project.test.controller;


import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.example.demo.model.Customer;
import com.example.demo.repository.CustomerRepository;
import com.example.demo.service.CustomerService;
import com.fasterxml.jackson.databind.ObjectMapper;



@RunWith(SpringRunner.class)
@SpringBootTest
public class TestCustomerController {

	private MockMvc mockMvc;
	@Autowired
	private WebApplicationContext context;
	
	@Autowired
	Customer cust;
	
	@Autowired
	CustomerService custmerService;
	
	@MockBean
	CustomerRepository custmerRepository;
	
	ObjectMapper om = new ObjectMapper();
	
	@Before
	public void setUp() {
		mockMvc = MockMvcBuilders.webAppContextSetup(context).build();
	}
	
	@Test
	public void testShowCust() throws Exception {
		
		mockMvc.perform(get("/showCustomer")).andExpect(status().isOk()).andExpect(view().name("Customer view")).andReturn();
	}
	
}
