package com.example.busbookingtrial.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.example.busbookingtrial.entity.Bus;

public interface BusRepository extends CrudRepository<Bus, Long>{

	@Query ("from Bus where currentCity=:currentCity and destinationCity=:destinationCity and date=:date" )
	 List<Bus> fullList(@Param("currentCity") String from, @Param("destinationCity")String to, @Param("date")String date);
}
