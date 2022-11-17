package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.example.demo.model.CompanyShare;
import com.example.demo.repository.CompanyShareRepository;
import com.example.demo.service.GEC_Service;
import com.example.demo.service.GEC_Service_Impl;

@Configuration
@EnableAutoConfiguration
@ComponentScan(basePackages={"com.example.demo.service","com.example.demo.repository","com.example.demo.controller","com.example.demo.model"})
@EnableTransactionManagement
@EnableJpaRepositories

public class GlobalExchangeCentreApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationcontext=SpringApplication.run(GlobalExchangeCentreApplication.class,args);
	    
	
		 GEC_Service_Impl gec_service =applicationcontext.getBean(GEC_Service_Impl.class);
		
		 
	}

}
