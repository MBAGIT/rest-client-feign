/**
 * 
 */
package com.bmh.feign.rest.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bmh.coding.model.Contract;
import com.bmh.coding.model.Customer;

import feign.Headers;

/**	
 * @author Mohamed Babchia
 *
 */
@Headers("Accept: application/json")
@FeignClient("BOOT-CUSTOMER-SERVICE")
public interface CustomerRestClient {

	/**
	 * Method to add New Customer
	 * 
	 * @param input
	 *            Customer to save
	 * @return
	 */
	@RequestMapping(method = RequestMethod.PUT, value = "/customerservice/customer", consumes = "application/json")
	ResponseEntity<Object> addCustomer(Customer input);

	/**
	 * Method to add New Contract
	 * 
	 * @param customerId
	 * @param input
	 * @return
	 */
	@RequestMapping(method = RequestMethod.PUT, value = "/customerservice/contract/{customerId}")
	@Headers("Content-Type: application/json")
	ResponseEntity<Object> add(@PathVariable("customerId") Long customerId, @RequestBody Contract input);

	/**
	 * Method to show All Informations of the Customer
	 * 
	 * @param customerId
	 * @return
	 */
	@RequestMapping(method = RequestMethod.GET, value = "/customerservice/customer/{customerId}")
	Customer getCustomerInformation(@PathVariable("customerId") Long customerId);

	/**
	 * Method retrieve the sum of revenues of all contracts from an existing
	 * customer
	 * 
	 * @param customerId
	 * @return {@link ResponseEntity}
	 */
	@RequestMapping(method = RequestMethod.GET, value = "/customerservice/contract/{customerId}")
	ResponseEntity<Double> getSumOfRevenueOfAllContracts(@PathVariable("customerId") Long customerId);

}
