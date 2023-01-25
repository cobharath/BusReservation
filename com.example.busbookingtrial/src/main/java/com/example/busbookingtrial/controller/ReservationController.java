package com.example.busbookingtrial.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.busbookingtrial.entity.Passenger;
import com.example.busbookingtrial.entity.Reservation;
import com.example.busbookingtrial.repository.PassengerRepository;
import com.example.busbookingtrial.service.ReservationService;

@Controller
public class ReservationController {

	@Autowired
	private ReservationService rs;
	
	@Autowired
	private PassengerRepository pr;
	
@RequestMapping("/ReservationDetails")
	public String reservationPage( @RequestParam ("busId") long id ,@RequestParam ("firstname") String firstname ,@RequestParam ("lastname") String lastname
			,@RequestParam ("email") String email ,@RequestParam ("mobile") String mobile  , Model model)
{
	

	
	
	Reservation bus = rs.reservationPage(id ,firstname , lastname,email,mobile );
	
	model.addAttribute("bus", bus.getId());
	
		return "ReservationComplete";
	
	
	
	
		
		
	}
	
}
