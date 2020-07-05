/**
 * 
 */
package com.wftp.registration.model;

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
@Table(name="REGISTRATION")
/* @Document(collection = "registration") */
public class UserRegistration implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4438854508205345577L;
	
	@Id
	@GeneratedValue
	@Column(name="USER_ID")
	private Long userId;
	@Column(name="USER_NAME")
	private String userName;
	@Column(name="PASSWORD")
	private String password;
	@Column(name="CONFIRM_PASSWORD")
	private String confirmPassword;
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
	
	@Column(name="ADDRESS")
	private String address;
	@Column(name="CITY")
	private String city;
	@Column(name="STATE")
	private String state;
	@Column(name="COUNTRY")
	private String country;
	@Column(name="ZIP_CODE")
	private String zipCode;
	
	@Column(name="USER_ADMIN")
	private Boolean isAdmin;
	
	public UserRegistration() {
	}
	
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getConfirmPassword() {
		return confirmPassword;
	}
	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	public Boolean isAdmin() {
		return isAdmin;
	}
	public void setAdmin(Boolean isAdmin) {
		this.isAdmin = isAdmin;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("UserRegistration [userId=");
		builder.append(userId);
		builder.append(", userName=");
		builder.append(userName);
		builder.append(", password=");
		builder.append(password);
		builder.append(", confirmPassword=");
		builder.append(confirmPassword);
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
		builder.append(", address=");
		builder.append(address);
		builder.append(", city=");
		builder.append(city);
		builder.append(", state=");
		builder.append(state);
		builder.append(", country=");
		builder.append(country);
		builder.append(", zipCode=");
		builder.append(zipCode);
		builder.append(", isAdmin=");
		builder.append(isAdmin);
		builder.append("]");
		return builder.toString();
	}
}
