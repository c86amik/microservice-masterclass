/**
 * 
 */
package com.wftp.flight.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author amik
 *
 */
@Entity
@Table(name="FLIGHT_SEARCH_DETAILS")
public class FlightSearchDetails implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4438854508205345577L;
	
	@Id
	@GeneratedValue
	@Column(name="FLIGHT_ID")
	private Long flightId;
	@Column(name="FLIGHT_NAME")
	private String flightName;
	@Column(name="FLIGHT_TYPE")
	private String flightType;
	@Column(name="SOURCE_AIRPORT_CODE")
	private String sourceAirportCode;
	@Column(name="SOURCE_AIRPORT_NAME")
	private String sourceAirportName;
	@Column(name="DESTINATION_AIRPORT_CODE")
	private String destinationAirportCode;
	@Column(name="DESTINATION_AIRPORT_NAME")
	private String destinationAirportName;
	@Column(name="BOOKING_PRICE")
	private Double bookTicketPrice;
	@Column(name="DURATION")
	private String duration;
	@Column(name="NO_OF_STOPS")
	private Long stops;
	
	@Column(name="FLIGHT_CANCELLED")
	private Boolean isCancelled;
	
	public FlightSearchDetails() {
	}

	public Long getFlightId() {
		return flightId;
	}
	public void setFlightId(Long flightId) {
		this.flightId = flightId;
	}
	public String getFlightName() {
		return flightName;
	}
	public void setFlightName(String flightName) {
		this.flightName = flightName;
	}
	public String getFlightType() {
		return flightType;
	}
	public void setFlightType(String flightType) {
		this.flightType = flightType;
	}
	public String getSourceAirportCode() {
		return sourceAirportCode;
	}
	public void setSourceAirportCode(String sourceAirportCode) {
		this.sourceAirportCode = sourceAirportCode;
	}
	public String getSourceAirportName() {
		return sourceAirportName;
	}
	public void setSourceAirportName(String sourceAirportName) {
		this.sourceAirportName = sourceAirportName;
	}
	public String getDestinationAirportCode() {
		return destinationAirportCode;
	}
	public void setDestinationAirportCode(String destinationAirportCode) {
		this.destinationAirportCode = destinationAirportCode;
	}
	public String getDestinationAirportName() {
		return destinationAirportName;
	}
	public void setDestinationAirportName(String destinationAirportName) {
		this.destinationAirportName = destinationAirportName;
	}
	public Double getBookTicketPrice() {
		return bookTicketPrice;
	}
	public void setBookTicketPrice(Double bookTicketPrice) {
		this.bookTicketPrice = bookTicketPrice;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	public Long getStops() {
		return stops;
	}
	public void setStops(Long stops) {
		this.stops = stops;
	}
	public Boolean isCancelled() {
		return isCancelled;
	}
	public void setCancelled(Boolean isCancelled) {
		this.isCancelled = isCancelled;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("FlightSearchDetails [flightId=");
		builder.append(flightId);
		builder.append(", flightName=");
		builder.append(flightName);
		builder.append(", flightType=");
		builder.append(flightType);
		builder.append(", sourceAirportCode=");
		builder.append(sourceAirportCode);
		builder.append(", sourceAirportName=");
		builder.append(sourceAirportName);
		builder.append(", destinationAirportCode=");
		builder.append(destinationAirportCode);
		builder.append(", destinationAiportName=");
		builder.append(destinationAirportName);
		builder.append(", bookTicketPrice=");
		builder.append(bookTicketPrice);
		builder.append(", duration=");
		builder.append(duration);
		builder.append(", stops=");
		builder.append(stops);
		builder.append(", isCancelled=");
		builder.append(isCancelled);
		builder.append("]");
		return builder.toString();
	}
}
