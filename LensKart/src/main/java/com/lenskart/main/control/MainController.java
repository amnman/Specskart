package com.lenskart.main.control;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lenskart.main.model.RegisterMain;
import com.lenskart.main.repo.RegisterRepo;


@RestController
public class MainController {
	
	@Autowired
	RegisterRepo rr;
	
	@RequestMapping("/registrations")
	public List<RegisterMain> getReg(){
		return (List<RegisterMain>)rr.findAll();
	}
	@RequestMapping(method=RequestMethod.GET,value="/registrations/{id}")
	public Optional<RegisterMain> getRegid(@PathVariable String id){
		try {
		Optional<RegisterMain> li= rr.findById(id);
		return li;
	}
		catch(Exception e) {
			return null;
		}
	}
	@RequestMapping(method=RequestMethod.POST,value="/registrations")
	public RegisterMain postReg(@RequestBody RegisterMain rm){
		return rr.save(rm);
	}
	@RequestMapping(method=RequestMethod.PUT,value="/registrations/{id}")
	public void putReg(@RequestBody RegisterMain rm, @PathVariable String id){
		 rr.save(rm);
	}
	@RequestMapping(method=RequestMethod.DELETE,value="/registrations/{id}")
	public void postReg( @PathVariable String id){
		 rr.deleteById(id);
	}
	@RequestMapping(method=RequestMethod.PUT,value="/changepassword/{id}")
	public RegisterMain chngPwd(@RequestBody String password,@PathVariable String id) {
	RegisterMain r=rr.findById(id).get();
		r.setPassword(password);
		return rr.save(r);
	}
	

}
