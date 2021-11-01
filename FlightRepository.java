package com.infygo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.infygo.entity.FlightDetails;

@Repository
public interface FlightRepository extends JpaRepository<FlightDetails, String> {

	List<FlightDetails> findBySourceAndDestinationAndFlightAvailableDate(String source, String destination,String flightAvailableDate);
}
