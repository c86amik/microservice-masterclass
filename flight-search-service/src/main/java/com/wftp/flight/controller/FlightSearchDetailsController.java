package com.wftp.flight.controller;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.wftp.flight.exception.FlightSearchException;
import com.wftp.flight.model.FlightSearchDetails;
import com.wftp.flight.repository.FlightSearchDetailsRepository;


/**
 * 
 */

/**
 * @author amik
 *
 */
@RestController
//@RequestMapping(path = "/register")
public class FlightSearchDetailsController {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(FlightSearchDetailsController.class);
	
	@Autowired
	private FlightSearchDetailsRepository flightSearchDetailsRepository;
	
	@GetMapping("/flights")
    public List<FlightSearchDetails> getAllFlights() {
		LOGGER.info("getAllFlights -> All Flights fetched");
		return flightSearchDetailsRepository.findAll();
    }
	
	@PostMapping("/addFlight")
    public FlightSearchDetails saveFlightDetails(@RequestBody FlightSearchDetails flightSearchDetails) {
        LOGGER.info("saveFlightDetails -> New Flight Saved");
        return flightSearchDetailsRepository.save(flightSearchDetails);
    }

	@GetMapping("/flight/{id}")
    public FlightSearchDetails getFlightDetailsById(@PathVariable(value = "id") Long flightId) {
    	FlightSearchDetails flightSearchDetails = flightSearchDetailsRepository.findById(flightId)
    		.orElseThrow(() -> new FlightSearchException("Flight not found", flightId.toString()));
    	LOGGER.info("getFlightDetailsById -> Fetch the flight by flightId as : {}", flightId);
        return flightSearchDetails;
    }
	
	@PostMapping("/flightSearch")
    public List<FlightSearchDetails> getFlightsBySourceAndDestinationAirportNames(@RequestBody FlightSearchDetails searchDetails) {
    	List<FlightSearchDetails> flightSearchDetails = flightSearchDetailsRepository
    			.findBySourceAirportNameAndDestinationAirportName(searchDetails.getSourceAirportName(), searchDetails.getDestinationAirportName());
    	if(null == flightSearchDetails) {
    		throw new FlightSearchException("Flights not found within ", searchDetails.getSourceAirportName() + " and " + searchDetails.getDestinationAirportName());
    	}
    	LOGGER.info("getFlightDetailsById -> Fetch the flights by Source Airport {} and Destination Airport Name {}", 
    			searchDetails.getSourceAirportName(), searchDetails.getDestinationAirportName());
        return flightSearchDetails;
    }
	
	@GetMapping("/flight/{minPrice}{maxPrice}")
    public List<FlightSearchDetails> getFlightsWithinPrice(@PathVariable(value = "minPrice") Double minPrice, 
    		@PathVariable(value = "maxPrice") Double maxPrice) {
    	List<FlightSearchDetails> flightSearchDetails = flightSearchDetailsRepository
    			.findByPriceWithinRange(minPrice, maxPrice);
    	if(null == flightSearchDetails) {
    		throw new FlightSearchException("Flights not found within ", minPrice + " and " + maxPrice);
    	}
    	LOGGER.info("getFlightDetailsById -> Fetch the flights within price range os {}, {}", 
    			minPrice, maxPrice);
        return flightSearchDetails;
    }
    
	@DeleteMapping("/deleteFlight/{id}")
    public void deleteFlightDetails(@PathVariable(value = "id") Long flightId) {
		FlightSearchDetails flightSearchDetails = flightSearchDetailsRepository.findById(flightId)
	        .orElseThrow(() -> new FlightSearchException("Flight not found", flightId.toString()));
	    flightSearchDetailsRepository.delete(flightSearchDetails);
    	LOGGER.info("deleteFlightDetails -> Delete the flight of flightId : {}", flightId);
    }
	
}
