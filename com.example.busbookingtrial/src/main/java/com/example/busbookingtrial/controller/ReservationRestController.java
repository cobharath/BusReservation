package com.example.busbookingtrial.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.busbookingtrial.entity.Reservation;
import com.example.busbookingtrial.repository.ReservationRepository;
import com.example.busbookingtrial.service.ReservationService;

@RestController
@RequestMapping ("/api/reservation")
public class ReservationRestController {
	
	@Autowired
	private ReservationService rs;
	
	@Autowired
	private ReservationRepository rr;
	
	@RequestMapping("/{id}")
	public Reservation getAllData(@PathVariable ("id") long id) {
		
		
		Optional<Reservation> findById = rr.findById(id);
		Reservation reservation = findById.get();
		return reservation;
		
		
		

		
		
		
		
	}
	
	
	
	
	

}
