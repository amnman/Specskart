package com.lenskart.main.control;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import com.lenskart.main.model.State;

import com.lenskart.main.repo.StateRepo;

@RestController
public class StateController {
	@Autowired
	StateRepo sr;
	@RequestMapping("/states")
	public List<State> getState(){
		return (List<State>)sr.findAll();
	}
	@RequestMapping(method=RequestMethod.GET,value="/state/{id}")
	public Optional<State> getStateId(@PathVariable long id){
		try {
		Optional<State> li= sr.findById(id);
		return li;
	}
		catch(Exception e) {
			return null;
		}
	}
	@RequestMapping(method=RequestMethod.POST,value="/state")
	public State postState(@RequestBody State rm){
		 return sr.save(rm);
	}
	@RequestMapping(method=RequestMethod.GET,value="/cstate")
	public List<State> getCState(@RequestParam long cid){
		return sr.findByCId(cid);
	}

}
