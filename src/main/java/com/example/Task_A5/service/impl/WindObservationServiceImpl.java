package com.example.Task_A5.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Task_A5.model.entity.WindObservation;
import com.example.Task_A5.model.repository.WindObservationRepository;
import com.example.Task_A5.service.WindObservationService;

@Service
public class WindObservationServiceImpl implements WindObservationService {
	
	private final WindObservationRepository windObservationRepository;
	
	@Autowired
	public WindObservationServiceImpl(WindObservationRepository windObservationRepository) {
		this.windObservationRepository = windObservationRepository;
	}

	@Override
	public List<WindObservation> getByMaximumSustainedWind() {
		return windObservationRepository.getByMaximumSustainedWind();
	}
	
	

}
