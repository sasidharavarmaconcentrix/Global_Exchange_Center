package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.service.GEC_Service;

@Controller
public class ShareController {
    @Autowired
    private GEC_Service gec_service;
    @GetMapping("/")
    public String viewlistofcompanies(Model model) {
    	model.addAttribute("listofcompanies",gec_service.getListOfCpmpanies());
    	
    	System.out.println("ji");
		return "home_companies_list";
    }
}
