package com.example.busbookingtrial.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.cassandra.CassandraProperties.Request;
import org.springframework.stereotype.Service;

import com.example.busbookingtrial.entity.Bus;
import com.example.busbookingtrial.entity.Passenger;
import com.example.busbookingtrial.entity.Reservation;
import com.example.busbookingtrial.repository.BusRepository;
import com.example.busbookingtrial.repository.PassengerRepository;
import com.example.busbookingtrial.repository.ReservationRepository;

@Service
public class ReservationServiceImpl implements ReservationService {

	@Autowired
 private  BusRepository br;
	
	@Autowired
	private PassengerRepository pr;
	
	@Autowired
	private ReservationRepository rr;
	
	
	@Override
	public Reservation reservationPage(long id, String firstname, String lastname, String email, String mobile) {
		
		Passenger p = new Passenger();
		p.setFirstname(firstname);
		p.setLastname(lastname);
		p.setMobile(mobile);
		p.setEmail(email);
		
		pr.save(p);
		
		
		long id2 = p.getId();
		Optional<Passenger> findById = pr.findById(id2);
		Passenger passenger = findById.get();
		
		
		Optional<Bus> b = br.findById(id);
		Bus bus = b.get();
		
		
		
		Reservation r = new Reservation();
		r.setPassenger(passenger);
		r.setBus(bus);
		r.setCheckin(false);
		
		rr.save(r);

		return r;
		
	}



	


	
	
	
	

}
