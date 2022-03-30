package com.sap.chatbot.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.sap.chatbot.excel.util.CustomerRepository;


@Configuration
public class ExcelfileConfig {
	@Bean
	CustomerRepository engine() {
        return new CustomerRepository();
    }
}
