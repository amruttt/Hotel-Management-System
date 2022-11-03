package com.project.test.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.example.demo.HmsSbProjectApplication;
import com.example.demo.model.Customer;
@WebAppConfiguration
@RunWith(SpringRunner.class)
@SpringBootTest(classes = HmsSbProjectApplication.class)
public class TestCustomerPojo {
	
	@MockBean
	Customer cust;
	
	@Test
	public void testDefaultConstructor() {
		cust = new Customer();
		Object expectedObject = new Customer();
		assertNotEquals(expectedObject, cust);
	}
	
	@Test
	public void testCustUserName() {
		
		cust = new Customer(3,"amrut","1234567891","amruttt","12345","amrut@");
		cust.setCusUsername("ankita");
		assertEquals(true,cust.getCusUsername() == "ankita");
	}
	
	@Test
	public void testCustUsername1() {
		cust = new Customer(3,"amrut","1234567891","amruttt","12345","amrut@");
		assertEquals("amruttt",cust.getCusUsername());
		
	}
	
	@Test
	public void testCustName() {
		
		cust = new Customer(3,"amrut","1234567891","amruttt","12345","amrut@");
		cust.setCusName("anika");
		assertEquals(true,cust.getCusName() == "anika");
	}
	
	@Test
	public void testCustname1() {
		cust = new Customer(3,"amrut","1234567891","amruttt","12345","amrut@");
		assertEquals("amrut",cust.getCusName());
		
	}
	
	@Test
	public void testCustId() {
		
		cust = new Customer(3,"amrut","1234567891","amruttt","12345","amrut@");
		cust.setCusId(101);
		assertEquals(true,cust.getCusId() == 101);
	}
	
	@Test
	public void testCustId1() {
		cust = new Customer(3,"amrut","1234567891","amruttt","12345","amrut@");
		assertEquals(3,cust.getCusId());
		
	}
	
	@Test
	public void testCustPassword() {
		
		cust = new Customer(3,"amrut","1234567891","amruttt","12345","amrut@");
		cust.setCusPassword("ankita");
		assertEquals(true,cust.getCusPassword() == "ankita");
	}
	
	@Test
	public void testCustPassword1() {
		cust = new Customer(3,"amrut","1234567891","amruttt","12345","amrut@");
		assertEquals("12345",cust.getCusPassword());
		
	}
	
	@Test
	public void testCustEmail() {
		
		cust = new Customer(3,"amrut","1234567891","amruttt","12345","amrut@");
		cust.setCusEmail("annn@gmail.com");
		assertEquals(true,cust.getCusEmail() == "annn@gmail.com");
	}
	
	@Test
	public void testCustEmail4() {
		cust = new Customer(3,"amrut","1234567891","amruttt","12345","amrut@");
		assertEquals("amrut@",cust.getCusEmail());
		
	}
	
	@Test
	public void testCusPhnNo() {
		
		cust = new Customer(3,"amrut","1234567891","amruttt","12345","amrut@");
		cust.setCusPhnNo("9876543211");
		assertEquals(true,cust.getCusPhnNo() == "9876543211");
	}
	
	@Test
	public void testCusPhnNo1() {
		cust = new Customer(3,"amrut","1234567891","amruttt","12345","amrut@");
		assertEquals("1234567891",cust.getCusPhnNo());
		
	}
	
	

	
	
	
	

}
