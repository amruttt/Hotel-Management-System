package com.example.demo.controller;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Booking;
import com.example.demo.service.BookingService;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@RestController
public class BookingController {

	@Autowired
	private BookingService service;

	@PostMapping("/acceptOrRejectBooking/{bookingId}/{venId}/{status}")
	public String acceptOrReject(@PathVariable int bookingId, @PathVariable int venId, @PathVariable String status) {
		return service.acceptOrRejectBooking(bookingId, venId, status);
	}

	
	@PostMapping("/placeBooking")
	public String add(@RequestBody Booking booking) {
		return service.placeBooking(booking);
	}


	@RequestMapping(value = "/customerBooking/{cid}")
	public List<Booking> customerPendingBooking(@PathVariable int cid) {
		return service.showCustomerPendingBooking(cid);
	}

	
	@RequestMapping(value = "/customerPendingBooking/{cid}")
	public List<Booking> customerBooking(@PathVariable int cid) {
		return service.showCustomerBooking(cid);
	}


	@RequestMapping(value = "/vendorPendingBooking/{vid}")
	public List<Booking> vendorPendingBooking(@PathVariable int vid) {
		return service.showVendorPendingBooking(vid);
	}


	@RequestMapping(value = "/vendorBooking/{vid}")
	public List<Booking> vendorBooking(@PathVariable int vid) {
		return service.showVendorBooking(vid);
	}


	@RequestMapping(value = "/showbooking")
	public List<Booking> list() {
		return service.showBooking();
	}

	@RequestMapping("/booking/{id}")
	public ResponseEntity<Booking> get(@PathVariable int id) {
		try {
			Booking booking = service.search(id);
			return new ResponseEntity<Booking>(booking, HttpStatus.OK);
		} catch (NoSuchElementException e) {
			return new ResponseEntity<Booking>(HttpStatus.NOT_FOUND);
		}
	}

}
