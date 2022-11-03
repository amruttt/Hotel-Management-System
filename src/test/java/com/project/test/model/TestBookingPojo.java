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
import com.example.demo.model.Booking;
import com.example.demo.model.Customer;

import java.time.Month;
import java.util.Date;


@WebAppConfiguration
@RunWith(SpringRunner.class)
@SpringBootTest(classes = HmsSbProjectApplication.class)
	public class TestBookingPojo {
		
		@MockBean
		Booking booking;
		
		Date d = new Date();
		
		@Test
		public void testDefaultConstructor() {
			booking = new Booking();
			Object expectedObject = new Booking();
			assertNotEquals(expectedObject, booking);
		}
		
		
		@Test
		public void testBookid() {
			
			booking = new Booking();
			booking.setBookingId(1);
			booking.setCusId(1);
			booking.setVenId(1);
			booking.setWalSource("PAYTM");
			booking.setRoomId(1);
			//booking.setBookingDate(d.getDate());
			booking.setBookingBillamount(1500.0);
			booking.setBookingStatus("ACCEPTED");
			booking.setBookingComments("Good");
			booking.setBookingId(102);
			assertEquals(true,booking.getBookingId() == 102);
		}
		
		@Test
		public void testBookid1() {
			booking = new Booking();
			booking.setBookingId(1);
			booking.setCusId(1);
			booking.setVenId(1);
			booking.setWalSource("PAYTM");
			booking.setRoomId(1);
			//booking.setBookingDate(d.getDate());
			booking.setBookingBillamount(1500.0);
			booking.setBookingStatus("ACCEPTED");
			booking.setBookingComments("Good");
			
			assertEquals(1,booking.getBookingId());
			
		}
		
		@Test
		public void testCustId() {
			
			booking = new Booking();
			booking.setBookingId(1);
			booking.setCusId(1);
			booking.setVenId(1);
			booking.setWalSource("PAYTM");
			booking.setRoomId(1);
			//booking.setBookingDate(d.getDate());
			booking.setBookingBillamount(1500.0);
			booking.setBookingStatus("ACCEPTED");
			booking.setBookingComments("Good");
			booking.setCusId(102);
			assertEquals(true,booking.getCusId() == 102);
		}
		
		@Test
		public void testCustId1() {
			booking = new Booking();
			booking.setBookingId(1);
			booking.setCusId(1);
			booking.setVenId(1);
			booking.setWalSource("PAYTM");
			booking.setRoomId(1);
			//booking.setBookingDate(d.getDate());
			booking.setBookingBillamount(1500.0);
			booking.setBookingStatus("ACCEPTED");
			booking.setBookingComments("Good");
			
			assertEquals(1,booking.getCusId());
			
		}
		
		@Test
		public void testVenId() {
			
			booking = new Booking();
			booking.setBookingId(1);
			booking.setCusId(1);
			booking.setVenId(1);
			booking.setWalSource("PAYTM");
			booking.setRoomId(1);
			//booking.setBookingDate(d.getDate());
			booking.setBookingBillamount(1500.0);
			booking.setBookingStatus("ACCEPTED");
			booking.setBookingComments("Good");
			booking.setVenId(102);
			assertEquals(true,booking.getVenId() == 102);
		}
		
		@Test
		public void testVenId1() {
			booking = new Booking();
			booking.setBookingId(1);
			booking.setCusId(1);
			booking.setVenId(1);
			booking.setWalSource("PAYTM");
			booking.setRoomId(1);
			//booking.setBookingDate(d.getDate());
			booking.setBookingBillamount(1500.0);
			booking.setBookingStatus("ACCEPTED");
			booking.setBookingComments("Good");
			
			assertEquals(1,booking.getVenId());
			
		}
		
		@Test
		public void testWalSource() {
			
			booking = new Booking();
			booking.setBookingId(1);
			booking.setCusId(1);
			booking.setVenId(1);
			booking.setWalSource("PAYTM");
			booking.setRoomId(1);
			//booking.setBookingDate(d.getDate());
			booking.setBookingBillamount(1500.0);
			booking.setBookingStatus("ACCEPTED");
			booking.setBookingComments("Good");
			booking.setWalSource("Phone Pay");
			assertEquals(true,booking.getWalSource() == "Phone Pay");
		}
		
		@Test
		public void testWalSource1() {
			booking = new Booking();
			booking.setBookingId(1);
			booking.setCusId(1);
			booking.setVenId(1);
			booking.setWalSource("PAYTM");
			booking.setRoomId(1);
			//booking.setBookingDate(d.getDate());
			booking.setBookingBillamount(1500.0);
			booking.setBookingStatus("ACCEPTED");
			booking.setBookingComments("Good");
			
			assertEquals("PAYTM",booking.getWalSource());
			
		}
		
		@Test
		public void testsetRoomId() {
			
			booking = new Booking();
			booking.setBookingId(1);
			booking.setCusId(1);
			booking.setVenId(1);
			booking.setWalSource("PAYTM");
			booking.setRoomId(103);
			//booking.setBookingDate(d.getDate());
			booking.setBookingBillamount(1500.0);
			booking.setBookingStatus("ACCEPTED");
			booking.setBookingComments("Good");
			booking.setWalSource("Phone Pay");
			assertEquals(true,booking.getRoomId() == 103);
		}
		
		@Test
		public void testsetRoomId1() {
			booking = new Booking();
			booking.setBookingId(1);
			booking.setCusId(1);
			booking.setVenId(1);
			booking.setWalSource("PAYTM");
			booking.setRoomId(1);
			//booking.setBookingDate(d.getDate());
			booking.setBookingBillamount(1500.0);
			booking.setBookingStatus("ACCEPTED");
			booking.setBookingComments("Good");
			
			assertEquals(1,booking.getRoomId());
			
		}
		
		@Test
		public void testBookingBillamount() {
			
			booking = new Booking();
			booking.setBookingId(1);
			booking.setCusId(1);
			booking.setVenId(1);
			booking.setWalSource("PAYTM");
			booking.setRoomId(103);
			//booking.setBookingDate(d.getDate());
			booking.setBookingBillamount(2000);
			booking.setBookingStatus("ACCEPTED");
			booking.setBookingComments("Good");
			booking.setWalSource("Phone Pay");
			assertEquals(true,booking.getBookingBillamount() == 2000);
		}
		
		
		
		@Test
		public void testBookingStatus() {
			
			booking = new Booking();
			booking.setBookingId(1);
			booking.setCusId(1);
			booking.setVenId(1);
			booking.setWalSource("PAYTM");
			booking.setRoomId(103);
			//booking.setBookingDate(d.getDate());
			booking.setBookingBillamount(2000);
			booking.setBookingStatus("pending");
			booking.setBookingComments("Good");
			assertEquals(true,booking.getBookingStatus() == "pending");
		}
		
		@Test
		public void testBookingStatus1() {
			booking = new Booking();
			booking.setBookingId(1);
			booking.setCusId(1);
			booking.setVenId(1);
			booking.setWalSource("PAYTM");
			booking.setRoomId(1);
			//booking.setBookingDate(d.getDate());
			booking.setBookingBillamount(1500.0);
			booking.setBookingStatus("ACCEPTED");
			booking.setBookingComments("Good");
			
			assertEquals("ACCEPTED",booking.getBookingStatus());
			
		}
		
		

		@Test
		public void testBookingComments() {
			
			booking = new Booking();
			booking.setBookingId(1);
			booking.setCusId(1);
			booking.setVenId(1);
			booking.setWalSource("PAYTM");
			booking.setRoomId(103);
			//booking.setBookingDate(d.getDate());
			booking.setBookingBillamount(2000);
			booking.setBookingStatus("pending");
			booking.setBookingComments("nice");
			booking.setWalSource("Phone Pay");
			assertEquals(true,booking.getBookingComments() == "nice");
		}
		
		@Test
		public void testBookingComments1() {
			booking = new Booking();
			booking.setBookingId(1);
			booking.setCusId(1);
			booking.setVenId(1);
			booking.setWalSource("PAYTM");
			booking.setRoomId(1);
			//booking.setBookingDate(d.getDate());
			booking.setBookingBillamount(1500.0);
			booking.setBookingStatus("ACCEPTED");
			booking.setBookingComments("Good");
			
			assertEquals("Good",booking.getBookingComments());
			
		}
		
		
		
}