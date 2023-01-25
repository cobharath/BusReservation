package com.example.busbookingtrial.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.busbookingtrial.entity.Passenger;

public interface PassengerRepository extends CrudRepository<Passenger, Long> {

}
