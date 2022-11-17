package com.example.demo.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.model.CompanyShare;
import com.example.demo.service.GEC_Service;
import com.example.demo.service.GEC_Service_Impl;

@RestController
public class ShareController {
    @Autowired
    private GEC_Service gec_service;
    @GetMapping("/")
    public ModelAndView viewlistofcompanies(Model model) {
    	ModelAndView modelAndView = new ModelAndView("/home_companies_list"); 
    	modelAndView.addObject("listofcompanies",gec_service.getListOfCpmpanies());
    	return modelAndView;
    	
    	//model.addAttribute("listofcompanies",gec_service.getListOfCpmpanies());
    	//System.out.println("ji");
		//return "home_companies_list";    	
    	
    }
    @GetMapping("/AddCompany")
    public ModelAndView AddCompanytoList(Model model) {
		//System.out.println("Add te company");
    	ModelAndView modelAndView = new ModelAndView("Add_new_Company_form"); 
    	return modelAndView;
    	
    }
    @PostMapping("/add_new_company_toList")
    public ModelAndView doAdd(
            @RequestParam("CompanyID") long CompanyID,
            @RequestParam("CompanyName") String CompanyName,
            @RequestParam("SharePrice") Double SharePrice) {
            
        CompanyShare companyshare=new CompanyShare(CompanyID,CompanyName,SharePrice);
        gec_service.saveCompany(companyshare);
        ModelAndView modelAndView = new ModelAndView("redirect:/"); 
        return modelAndView;
    }
//    @GetMapping("/DeleteFromList/{CompanyId}")
//    public ModelAndView DeleteCompanyFromList(@PathVariable("CompanyId") long CompanyId , Model model) {
//    	gec_service.deleteemployeebyid(CompanyId);
//    	ModelAndView modelAndView = new ModelAndView("redirect:/"); 
//    	return modelAndView;
//    	
//    }
//    @GetMapping("/delete-todo")
//    public String deleteTdo(
//            @RequestParam int id
//    ) {
//        System.out.println(id);
//        todoRepository.deleteById(id);
//        return "redirect:/todos";
//    }
    @GetMapping("/delete-company")
    public ModelAndView deletecompany(
            @RequestParam("CompanyId") long CompanyId
    ) 
    {
    	gec_service.deleteemployeebyid(CompanyId);
    	ModelAndView modelAndView = new ModelAndView("redirect:/"); 
        return modelAndView;
    }
    @GetMapping("/update-company")
    public ModelAndView updatecompany(
            @RequestParam("CompanyId") long CompanyId
    ) 
    {
    	//gec_service.deleteemployeebyid(CompanyId);
    	Optional<CompanyShare> companyshare=gec_service. fetchcompanybyid(CompanyId);
//      companyshare.ifPresent(value -> System.out.println((value)));
//		companyshare.orElseThrow();
    	//System.out.println(companyshare.get());
    	CompanyShare companyshare1=companyshare.get();
    	System.out.println(companyshare1.getCompanyName());
    	System.out.println(companyshare1.getSharePrice());
    	
    	ModelAndView modelAndView = new ModelAndView("update_teamform"); 
    	modelAndView.addObject("companyid",companyshare1.getCompanyId());
    	modelAndView.addObject("companyname",companyshare1.getCompanyName());
    	//modelAndView.addObject("shareprice",companyshare1.getCompanyId());
    	modelAndView.addObject("shareprice", companyshare1.getSharePrice());
    	//modelAndView.addObject("companyshare",companyshare);
        return modelAndView;
    }
    @PostMapping("/update_company_toList")
    public ModelAndView doupdate(
            @RequestParam("CompanyID") long CompanyID,
            @RequestParam("CompanyName") String CompanyName,
            @RequestParam("SharePrice") Double SharePrice) {
            
        CompanyShare companyshare=new CompanyShare(CompanyID,CompanyName,SharePrice);
        gec_service.saveCompany(companyshare);
        ModelAndView modelAndView = new ModelAndView("redirect:/"); 
        return modelAndView;
    }
}
