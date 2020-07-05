/**
 * 
 */
package com.wftp.login.exception;

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
@Table(name="FLIGHT_EXCEPTION")
public class FlightException extends RuntimeException {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -6516355976276869122L;

	@Id
	@GeneratedValue
	@Column(name="EXCEPTION_ID")
	private Long exceptionId;
	@Column(name="USER_ID")
	private Long userId;
	@Column(name="USER_NAME")
	private String userName;
	@Column(name="EXCEPTION_MESSAGE")
	private String exceptionMessage;
	@Column(name="EXCEPTION_CAUSE")
	private String exceptionCause;
	@Column(name="METHOD_NAME")
	private String methodName;
	@Column(name="CLASS_NAME")
	private String className;
	
	public FlightException() {
	}
	
	public FlightException(Long userId, String userName, String exceptionMessage, String exceptionCause,
			String methodName, String className) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.exceptionMessage = exceptionMessage;
		this.exceptionCause = exceptionCause;
		this.methodName = methodName;
		this.className = className;
	}
	public Long getExceptionId() {
		return exceptionId;
	}
	public void setExceptionId(Long exceptionId) {
		this.exceptionId = exceptionId;
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
	public String getExceptionMessage() {
		return exceptionMessage;
	}
	public void setExceptionMessage(String exceptionMessage) {
		this.exceptionMessage = exceptionMessage;
	}
	public String getExceptionCause() {
		return exceptionCause;
	}
	public void setExceptionCause(String exceptionCause) {
		this.exceptionCause = exceptionCause;
	}
	public String getMethodName() {
		return methodName;
	}
	public void setMethodName(String methodName) {
		this.methodName = methodName;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("FlightException [exceptionId=");
		builder.append(exceptionId);
		builder.append(", userId=");
		builder.append(userId);
		builder.append(", userName=");
		builder.append(userName);
		builder.append(", exceptionMessage=");
		builder.append(exceptionMessage);
		builder.append(", exceptionCause=");
		builder.append(exceptionCause);
		builder.append(", methodName=");
		builder.append(methodName);
		builder.append(", className=");
		builder.append(className);
		builder.append("]");
		return builder.toString();
	}
}
