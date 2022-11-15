package com.example.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.model.CompanyShare;
import com.example.demo.repository.CompanyShareRepository;

@Service

public class GEC_Service_Impl implements GEC_Service {
	@Autowired
	private CompanyShareRepository companysharerepository;

	public CompanyShareRepository getCompanysharerepository() {
		return companysharerepository;
	}

	public void setCompanysharerepository(CompanyShareRepository companysharerepository) {
		this.companysharerepository = companysharerepository;
	}

	public Iterable<CompanyShare> getListOfCpmpanies() {
		return companysharerepository.findAll();
	}

	@Transactional

	public void saveCompany(CompanyShare companyshare) {
		// TODO Auto-generated method stub
		companysharerepository.save(companyshare);
	}

	@Override
	public void deleteemployeebyid(long companyID) {
		// TODO Auto-generated method stub
		companysharerepository.deleteById(companyID);
	}

	@Override
	
	  public void updatepricebyid(long companyID, double shareprice) { 
		// TODO Auto-generated method stub companysharerepository.update
	  
	  }
	 

	public Optional<CompanyShare> fetchcompanybyid(long companyID) {
		// TODO Auto-generated method stub
		return companysharerepository.findById(companyID);
	}
}
