/**
 * 
 */
package com.wftp.login.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wftp.login.exception.FlightException;

/**
 * @author amik
 *
 */
public interface FlightExceptionRepository  extends JpaRepository<FlightException, Long>{
	
	public FlightException findByUserName(String userName);

}
