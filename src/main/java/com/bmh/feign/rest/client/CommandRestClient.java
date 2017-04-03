/**
 * 
 */
package com.bmh.feign.rest.client;

import java.util.List;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bmh.coding.model.Command;

import feign.Headers;

/**
 * @author Mohamed
 *
 */
@Headers("Accept: application/json")
@FeignClient("BOOT-COMMAND-SERVICE")
public interface CommandRestClient {

	/**
	 * 
	 * Method to add command
	 * @param input  commande Json 
	 * @return ResponseEntity
	 */
	@RequestMapping(value = "/commandService/addCommand", method = RequestMethod.POST)
	@Headers("Content-Type: application/json")
	ResponseEntity<Object> addCommande(Command input);

	/**
	 * Method to return command information
	 * @param id
	 * @return {@link Command}
	 */
	@RequestMapping(value = "/commandService/command/{id}", method = RequestMethod.GET)
	Command getCommande(@PathVariable("id") String id);

	/**
	 * Method to return command information
	 * @param reference
	 * @return {@link Command}
	 */
	@RequestMapping(value = "/commandService/command/reference/{reference}", method = RequestMethod.GET)
	Command getCommandeByreference(@PathVariable("reference") String reference);

	/**
	 * get all commands
	 * @return {@link List} {@link Command}
	 * @see org.springframework.data.mongodb.repository.MongoRepository#findAll()
	 */
	@RequestMapping(value = "/commandService/commands", method = RequestMethod.GET)
	List<Command> getAllCommands();

}
