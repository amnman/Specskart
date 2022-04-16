package com.lenskart.main.control;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lenskart.main.model.Country;

import com.lenskart.main.repo.CountryRepo;


@RestController
public class CountryController {
	
	@Autowired
	CountryRepo cr;
	@RequestMapping("/countries")
	public List<Country> getCountry(){
		return (List<Country>)cr.findAll();
	}
	@RequestMapping(method=RequestMethod.GET,value="/country/{id}")
	public Optional<Country> getCountryid(@PathVariable long id){
		try {
		Optional<Country> li= cr.findById(id);
		return li;
	}
		catch(Exception e) {
			return null;
		}
	}
	@RequestMapping(method=RequestMethod.POST,value="/country")
	public Country postCountry(@RequestBody Country rm){
		 return cr.save(rm);
	}
}
