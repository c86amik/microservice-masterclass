/**
 * 
 */
package com.wftp.book.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wftp.book.model.FlightBookDetails;

/**
 * @author amik
 *
 */
@Repository
public interface FlightBookDetailsRepository extends JpaRepository<FlightBookDetails, Long>{

}
