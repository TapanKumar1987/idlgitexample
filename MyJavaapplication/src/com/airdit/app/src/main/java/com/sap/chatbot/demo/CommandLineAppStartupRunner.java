package com.sap.chatbot.demo;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.sap.chatbot.excel.util.Customer;
import com.sap.chatbot.excel.util.CustomerRepository;
@Component
public class CommandLineAppStartupRunner implements CommandLineRunner{
	@Autowired
	CustomerRepository repository;
	
	 public void run(String... args) throws Exception {
			// TODO Auto-generated method stub
		 List customers = Arrays.asList(
	    			new Customer(Long.valueOf(1), "Jack Smith", "Massachusetts", 23),
	    			new Customer(Long.valueOf(2), "Adam Johnson", "New York", 27),
	    			new Customer(Long.valueOf(3), "Katherin Carter", "Washington DC", 26),
	    			new Customer(Long.valueOf(4), "Jack London", "Nevada", 33), 
	    			new Customer(Long.valueOf(5), "Jason Bourne", "California", 36),
		 			new Customer(Long.valueOf(5), "Kumar Tapan", "Jajapur Town", 30));
	    	
			// save a list of Customers
			repository.saveAll(customers);
		}
	 
	 public void run(ApplicationArguments args) throws Exception {
	        
	    }
}
