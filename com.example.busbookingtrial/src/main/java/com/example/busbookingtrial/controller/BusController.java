package com.example.busbookingtrial.controller;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.busbookingtrial.entity.Bus;
import com.example.busbookingtrial.repository.BusRepository;

@Controller
public class BusController {
//	

//	
	@Autowired
	private BusRepository br;
//	
	@RequestMapping("/showbusses")
	public String showbuses() {
//		bs.saveBuses(bus);
//		
	return "BusList" ;
//		
	}
	
	
	@RequestMapping("/fullList")
	public String fullList(@RequestParam ("from") String from  , @RequestParam ("to") String to , @RequestParam("date") String date , Model model){
		
		List<Bus> bus = br.fullList(from,to,date);
		model.addAttribute("bus", bus);
		
		return "busFullList";
		
		
		
		
		
		
		
	}
	@RequestMapping("/Confirmation")
	public String findId(@RequestParam ("flightId") long id, Model model) {
		Optional<Bus> bus  = br.findById(id);
		Bus list = bus.get();
		model.addAttribute("list", list);
		
		
		
		return "Reservation";
		
		
	}
	
	

}
