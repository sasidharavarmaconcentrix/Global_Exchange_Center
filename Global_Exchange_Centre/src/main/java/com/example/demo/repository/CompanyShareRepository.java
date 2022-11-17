package com.example.demo.repository;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.example.demo.model.CompanyShare;


@Repository
public interface CompanyShareRepository  extends CrudRepository<CompanyShare,Long>{
     @Query(value="select max(company_id) from company_share", nativeQuery = true)
     public int findlastid();
     
}
