package com.example.busbookingtrial.service;

import java.util.List;

import com.example.busbookingtrial.entity.Passenger;
import com.example.busbookingtrial.entity.Reservation;

public interface ReservationService {


	Reservation reservationPage(long id, String firstname, String lastname, String email, String mobile);

	

}
