package com.example.Task_A5.model.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.Task_A5.model.entity.WindObservation;

@Repository
public interface WindObservationRepository extends JpaRepository<WindObservation, String> {
	
	@Query(value = "SELECT maximum_sustained_wind, northeastern, southeastern, southwestern, northwestern, \r\n"
			+ "northeastern2, southeastern2, southwestern2, northwestern2, \r\n"
			+ "northeastern3, southeastern3, southwestern3, northwestern3\r\n"
			+ "FROM test_tasks.wind_observation WHERE date LIKE '2015' AND place %ENDSWITH (A);",
			nativeQuery = true)
	public List<WindObservation> getByMaximumSustainedWind();

}
