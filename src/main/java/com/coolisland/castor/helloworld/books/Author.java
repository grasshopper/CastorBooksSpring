package com.coolisland.castor.helloworld.books;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;



public class Author {
	private static Log log = LogFactory.getLog(Author.class); 
	private String firstName = null;
	private String LastName = null;

	
	public Author() {
		String method = "Author"; 
		log.debug("Starting " + method + " Constructor");
	}
	
	
	public Author(String firstName, String lastName) {
		super();
		
		String method = "Author"; 
		log.debug("Starting " + method + " Constructor with params");
		
		this.firstName = firstName;
		LastName = lastName;
	}
	
	
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		String method = "getFirstName"; 
		log.debug("Starting " + method);
		
		log.debug(method + " returning " + firstName);
		
		return firstName;
	}
	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		String method = "setFirstName"; 
		log.debug("Starting " + method);
		
		this.firstName = firstName;
	}
	/**
	 * @return the lastName
	 */
	public String getLastName() {
		String method = "getLastName"; 
		log.debug("Starting " + method);
		
		log.debug(method + " returning " + LastName);
		
		return LastName;
	}
	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		String method = "setLastName"; 
		log.debug("Starting " + method);
		
		LastName = lastName;
	}
}
