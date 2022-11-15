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
	    
	//CompanyShareRepository repo = applicationcontext.getBean(CompanyShareRepository.class);
		 GEC_Service_Impl gec_service =applicationcontext.getBean(GEC_Service_Impl.class);
		 gec_service.getListOfCpmpanies(); 
		 CompanyShare new_company=new CompanyShare(); 
		 new_company.setCompanyId((long) 10000000);
		 new_company.setCompanyName("concentrix"); 
		 new_company.setSharePrice(100.00);
		 gec_service.saveCompany(new_company);
		 //System.out.println(gec_service.getListOfCpmpanies());
		 CompanyShare new_company1=new CompanyShare(); 
		 new_company1.setCompanyId((long) 10000001);
		 new_company1.setCompanyName("synnex"); 
		 new_company1.setSharePrice(101.00);
		 gec_service.saveCompany(new_company1);
		 gec_service.fetchcompanybyid(10000001);
		 //System.out.println(gec_service.getListOfCpmpanies());
		// gec_service.deleteemployeebyid(10000001);
		 
		 //gec_service.updatepricebyid((long)l0000001,102.00)
		 
	}

}
