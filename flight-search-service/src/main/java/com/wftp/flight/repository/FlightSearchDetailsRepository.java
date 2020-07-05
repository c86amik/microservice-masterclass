/**
 * 
 */
package com.wftp.flight.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.wftp.flight.model.FlightSearchDetails;

/**
 * @author amik
 *
 */
@Repository
public interface FlightSearchDetailsRepository extends JpaRepository<FlightSearchDetails, Long>{

	@Query("FROM FlightSearchDetails WHERE sourceAirportName = ?1 and destinationAirportName = ?2")
	List<FlightSearchDetails> findBySourceAirportNameAndDestinationAirportName(String sourceAirportName, String destinationAirportName);
	
	@Query("FROM FlightSearchDetails WHERE bookTicketPrice > ?1 and bookTicketPrice <= ?2")
	List<FlightSearchDetails> findByPriceWithinRange(Double minPrice, Double maxPrice);
}
