package com.example.busbookingtrial.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.busbookingtrial.entity.Reservation;

public interface ReservationRepository extends CrudRepository<Reservation, Long> {

}
