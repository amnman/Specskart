package com.lenskart.main.control;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lenskart.main.model.Productlist;
import com.lenskart.main.repo.ProductlistRepo;



@RestController
public class ProductlistController

{
	@Autowired
	ProductlistRepo pr;
	@RequestMapping("/products")
	public List<Productlist> getProductlist(){
		return (List<Productlist>)pr.findAll();
	}
	@RequestMapping(method=RequestMethod.GET,value="/products/{id}")
	public Optional<Productlist> getProductlistid(@PathVariable int id){
		try {
		Optional<Productlist> li= pr.findById(id);
		return li;
	}
		catch(Exception e) {
			return null;
		}
	}
	@RequestMapping(method=RequestMethod.POST,value="/product")
	public Productlist postProductlist(@RequestBody Productlist rm){
		 return pr.save(rm);
	}
}
