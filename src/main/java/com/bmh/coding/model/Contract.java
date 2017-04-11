/**
 * 
 */
package com.bmh.coding.model;

import java.util.Date;

/**
 * 
 * Entity Contract class description with attributes
 * 
 * @author Mohamed
 *
 */

public class Contract {

	/**
	 * Unique Id Contract attribute
	 */

	private Long id;

	/**
	 * The start date attribute
	 */
	public Date startDate;

	/**
	 * The Type contract attribute
	 * 
	 * I can use Enumeration for the type of this attribute if I have the full
	 * list of types contract
	 * 
	 */
	public String type;

	/**
	 * The monthly revenue
	 */
	public Double monthlyRevenue;

	private Customer customer;

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @return the startDate
	 */
	public Date getStartDate() {
		return startDate;
	}

	/**
	 * 
	 * Constructor with fields
	 * 
	 * @param startDate
	 * @param type
	 * @param monthlyRevenue
	 * @param customer
	 */
	public Contract(Date startDate, String type, Double monthlyRevenue, Customer customer) {
		this.startDate = startDate;
		this.type = type;
		this.monthlyRevenue = monthlyRevenue;
		this.customer = customer;
	}

	/**
	 * default constructor
	 * 
	 */
	public Contract() {

	}

	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @return the monthlyRevenue
	 */
	public Double getMonthlyRevenue() {
		return monthlyRevenue;
	}

}
