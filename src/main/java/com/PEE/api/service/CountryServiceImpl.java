package com.PEE.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.PEE.api.entity.Countries;
import com.PEE.api.repository.CountryRepository;

@Service
public class CountryServiceImpl implements CountryService{
	@Autowired
	private CountryRepository countryRepository;
	
	@Override
	public List<Countries> findAll(){
		return this.countryRepository.findAll();
	}
}
