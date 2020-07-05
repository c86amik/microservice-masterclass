package com.wftp.book.controller;
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

import com.wftp.book.exception.FlightBookException;
import com.wftp.book.model.FlightBookDetails;
import com.wftp.book.repository.FlightBookDetailsRepository;


/**
 * 
 */

/**
 * @author amik
 *
 */
@RestController
public class FlightBookDetailsController {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(FlightBookDetailsController.class);
	
	@Autowired
	private FlightBookDetailsRepository flightBookDetailsRepository;
	
	@GetMapping("/bookFlights")
    public List<FlightBookDetails> getAllBookings() {
		LOGGER.info("getAllBookings -> All Flight Bookings are fetched");
		return flightBookDetailsRepository.findAll();
    }
	
	@PostMapping("/bookFlight")
    public FlightBookDetails saveBookingDetails(@RequestBody FlightBookDetails flightBookDetails) {
        LOGGER.info("saveBookingDetails -> New Flight Booking Saved");
        return flightBookDetailsRepository.save(flightBookDetails);
    }

	@GetMapping("/bookFlight/{id}")
    public FlightBookDetails getBookingFlightDetailsById(@PathVariable(value = "id") Long bookId) {
    	FlightBookDetails flightBookDetails = flightBookDetailsRepository.findById(bookId)
    		.orElseThrow(() -> new FlightBookException("Booking not found", bookId.toString()));
    	LOGGER.info("getBookingFlightDetailsById -> Fetch the Booking Flight Details by bookId as : {}", bookId);
        return flightBookDetails;
    }
	
	@DeleteMapping("/deleteBookFlight/{id}")
    public void deleteBookingFlightDetails(@PathVariable(value = "id") Long bookId) {
		FlightBookDetails flightBookDetails = flightBookDetailsRepository.findById(bookId)
	        .orElseThrow(() -> new FlightBookException("Flight Booking not found", bookId.toString()));
	    flightBookDetailsRepository.delete(flightBookDetails);
    	LOGGER.info("deleteBookingFlightDetails -> Delete the flight booking of bookId : {}", bookId);
    }
	
}
