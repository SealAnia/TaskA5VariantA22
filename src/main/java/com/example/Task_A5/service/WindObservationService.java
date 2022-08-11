package com.example.Task_A5.service;

import java.util.List;

import com.example.Task_A5.model.entity.WindObservation;

public interface WindObservationService {
	
	List<WindObservation> getByMaximumSustainedWind();

}
