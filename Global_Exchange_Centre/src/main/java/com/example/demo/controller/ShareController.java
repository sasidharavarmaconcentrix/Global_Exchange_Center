package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.model.CompanyShare;
import com.example.demo.service.GEC_Service;
import com.example.demo.service.GEC_Service_Impl;

@Controller
public class ShareController {
    @Autowired
    private GEC_Service gec_service;
    @GetMapping("/")
    public String viewlistofcompanies(Model model) {
    	model.addAttribute("listofcompanies",gec_service.getListOfCpmpanies());
    	
    	//System.out.println("ji");
		return "home_companies_list";
    }
    @GetMapping("/AddCompany")
    public String AddCompanytoList(Model model) {
		//System.out.println("Add te company");
    	return "Add_new_Company_form";
    	
    }
    @PostMapping("/add_new_company_toList")
    public String doTransfer(
            @RequestParam("CompanyID") long CompanyID,
            @RequestParam("CompanyName") String CompanyName,
            @RequestParam("SharePrice") Double SharePrice) {
            
        CompanyShare companyshare=new CompanyShare(CompanyID,CompanyName,SharePrice);
		/*
		 * gec_service.saveCompany(companyshare); ModelAndView modelAndView = new
		 * ModelAndView(); modelAndView.setViewName("home_companies_list"); return
		 * modelAndView;
		 */
        gec_service.saveCompany(companyshare);
      //  return "redirect:/home_companies_list";
        return "redirect:/";
    }
}
