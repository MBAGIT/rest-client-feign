package com.bmh.coding.model;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.validator.constraints.Email;

/**
 * Entity Customer class
 * 
 * @author Mohamed
 *
 */

public class Customer {

	/**
	 * unique Id customer attribute
	 */

	private Long id;

	/**
	 * FullName customer attribute
	 */
	public String fullName;

	/**
	 * email customer attribute
	 */
	@Email
	public String email;

	/**
	 * list of contracts of each customer
	 * 
	 * Each Customer may have no, one, or many Contract entities. This is a 1:N
	 * relationship.
	 */

	public Set<Contract> contracts = new HashSet<>();

	/**
	 * Constructor with fields attributes
	 * 
	 * @param fullName
	 * @param email
	 */
	public Customer(String fullName, String email) {

		this.fullName = fullName;
		this.email = email;
	}

	/**
	 * default constructor
	 */
	public Customer() {

	}

	/**
	 * @return the fullName
	 */
	public String getFullName() {
		return fullName;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @return the customerId
	 */
	public Long getId() {
		return id;
	}

}
