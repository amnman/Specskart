package com.lenskart.main.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lenskart.main.model.Email;
import com.lenskart.main.repo.EmailRepo;

@RestController
public class EmailController {
	@Autowired
	EmailRepo er;
	
	@RequestMapping(method=RequestMethod.POST,value="/emails")
	public Email postEmail(@RequestBody String email) {
		Email e=new Email(email);
		return er.save(e);
	}
	

}
