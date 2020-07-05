/**
 * 
 */
package com.wftp.book.model;

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
@Table(name="FLIGHT_BOOK_DETAILS")
public class FlightBookDetails implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4438854508205345577L;
	
	@Id
	@GeneratedValue
	@Column(name="BOOK_ID")
	private Long bookId;
	@Column(name="USER_ID")
	private Long userId;
	@Column(name="FLIGHT_ID")
	private Long flightId;
	@Column(name="USER_NAME")
	private String userName;
	@Column(name="FIRST_NAME")
	private String firstName;
	@Column(name="MIDDLE_NAME")
	private String middleName;
	@Column(name="LAST_NAME")
	private String lastName;
	@Column(name="MOBILE")
	private String mobileNo;
	@Column(name="EMAIL")
	private String email;
	@Column(name="PASSPORT_NO")
	private String passport;
	
	@Column(name="FLIGHT_NAME")
	private String flightName;
	@Column(name="SOURCE_AIRPORT_NAME")
	private String sourceAirportName;
	@Column(name="DESTINATION_AIRPORT_NAME")
	private String destinationAirportName;
	@Column(name="BOOKING_PRICE")
	private Double bookTicketPrice;
	@Column(name="DURATION")
	private String duration;
	
	public FlightBookDetails() {
	}

	public Long getBookId() {
		return bookId;
	}
	public void setBookId(Long bookId) {
		this.bookId = bookId;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public Long getFlightId() {
		return flightId;
	}

	public void setFlightId(Long flightId) {
		this.flightId = flightId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassport() {
		return passport;
	}
	public void setPassport(String passport) {
		this.passport = passport;
	}
	public String getFlightName() {
		return flightName;
	}
	public void setFlightName(String flightName) {
		this.flightName = flightName;
	}
	public String getSourceAirportName() {
		return sourceAirportName;
	}
	public void setSourceAirportName(String sourceAirportName) {
		this.sourceAirportName = sourceAirportName;
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

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("FlightBookDetails [bookId=");
		builder.append(bookId);
		builder.append(", userId=");
		builder.append(userId);
		builder.append(", flightId=");
		builder.append(flightId);
		builder.append(", userName=");
		builder.append(userName);
		builder.append(", firstName=");
		builder.append(firstName);
		builder.append(", middleName=");
		builder.append(middleName);
		builder.append(", lastName=");
		builder.append(lastName);
		builder.append(", mobileNo=");
		builder.append(mobileNo);
		builder.append(", email=");
		builder.append(email);
		builder.append(", passport=");
		builder.append(passport);
		builder.append(", flightName=");
		builder.append(flightName);
		builder.append(", sourceAirportName=");
		builder.append(sourceAirportName);
		builder.append(", destinationAirportName=");
		builder.append(destinationAirportName);
		builder.append(", bookTicketPrice=");
		builder.append(bookTicketPrice);
		builder.append(", duration=");
		builder.append(duration);
		builder.append("]");
		return builder.toString();
	}
}
