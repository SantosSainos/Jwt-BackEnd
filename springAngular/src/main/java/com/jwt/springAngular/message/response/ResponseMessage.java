package com.jwt.springAngular.message.response;

/**
 * 
 * @author Santos Sainos Hernández
 *
 * @versino 1.0
 * 
 * – ResponseMessage object is just a message object.
 */

public class ResponseMessage {
	private String message;

	public ResponseMessage(String message) {
		this.message = message;
	}

	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}

}
