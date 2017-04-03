package com.bmh.feign.rest.client;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

import com.bmh.coding.model.Customer;

@SpringBootApplication
@EnableFeignClients
@EnableEurekaClient
public class RestClientFeignApplication {

	@Autowired
	private CommandRestClient commandRestClient;

	@Autowired
	private CustomerRestClient customerRestClient;

	@Bean
	CommandLineRunner demo() {

		return args -> {

			commandRestClient.getAllCommands().stream().forEach(System.out::println);

			Arrays.asList(commandRestClient.getCommandeByreference("ref1")).forEach(System.out::println);

			Arrays.asList(customerRestClient.addCustomer(new Customer("test rest client feign", "bmh@gmail.com")))
					.forEach(System.out::println);
			Arrays.asList(customerRestClient.addCustomer(new Customer("test rest2 client feign", "bmh2@gmail.com")))
					.forEach(System.out::println);
			Arrays.asList(customerRestClient.addCustomer(new Customer("test rest3 client feign", "bmh3@gmail.com")))
					.forEach(System.out::println);
			
			System.out.println("customer 1l email ******************************************"+customerRestClient.getCustomerInformation(1l).getEmail());
			
			
			;

		};

	}

	public static void main(String[] args) {
		SpringApplication.run(RestClientFeignApplication.class, args);
	}

}
