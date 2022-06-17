package com.PEE.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.PEE.api.entity.Countries;
import com.PEE.api.service.CountryService;

@RestController
@RequestMapping
public class CountryController {
	@Autowired private CountryService countryService;
	
	@GetMapping("/countries")
	public List<Countries> fetchAllCountries(){
		return this.countryService.findAll()
;	}
}
