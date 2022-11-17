package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.model.CompanyShare;

public interface GEC_Service {
	Iterable<CompanyShare> getListOfCpmpanies();
	void saveCompany(CompanyShare companyshare);
	void deletecompanybyid(long companyID);
	void updatepricebyid(long companyID,double shareprice);
	Optional<CompanyShare> fetchcompanybyid(long companyID);
	public int findlastid();
	
}
