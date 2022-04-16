package com.lenskart.main.control;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import com.lenskart.main.model.Bookings;
import com.lenskart.main.repo.BookingRepo;

@RestController
public class BookingController {
	@Autowired
	BookingRepo bookingrepo;
	@RequestMapping("/bookings")
	public List<Bookings> getBookings(){
		return (List<Bookings>) bookingrepo.findAll();
	}

		@RequestMapping(method=RequestMethod.POST,value="/booking")
		public Bookings postBookings(@RequestBody Bookings b) {
			return bookingrepo.save(b);
		}
		
		@RequestMapping(method=RequestMethod.GET,value="/bookings/{mail}")
		public List<Bookings> getBookingById(@PathVariable String mail){
			return bookingrepo.findByEidMail(mail);
		}
		@RequestMapping(method=RequestMethod.DELETE,value="/bookings/{id}")
		public void delById(@PathVariable int id) {
		bookingrepo.deleteById(id);
		}
}