/**
 * 
 */
package com.wftp.registration.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wftp.registration.model.UserRegistration;

/**
 * @author amik
 *
 */
@Repository
public interface UserRegistrationRepository extends JpaRepository<UserRegistration, Long>{
	
	public UserRegistration findByUserName(String userName);

}
