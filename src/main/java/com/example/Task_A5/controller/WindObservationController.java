package com.example.Task_A5.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.Task_A5.service.impl.WindObservationServiceImpl;

@Controller
public class WindObservationController {
	
	private final WindObservationServiceImpl windObservationService;
	
	@Autowired
	public WindObservationController(WindObservationServiceImpl windObservationService) {
		this.windObservationService = windObservationService;
	}
	
	@GetMapping(value = "/wind_observation")
	public String getWindObservation(Model model) {
		var windObservation = windObservationService.getByMaximumSustainedWind();
		model.addAttribute("observations", windObservation);
		return "wind_observation";
	}

}
