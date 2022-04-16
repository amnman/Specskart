package com.lenskart.main.control;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lenskart.main.model.Cart;
import com.lenskart.main.model.Email;
import com.lenskart.main.model.Productlist;
import com.lenskart.main.repo.CartRepo;



@RestController
public class CartController
{
	@Autowired
	CartRepo cr;
	@RequestMapping("/carts")
	public List<Cart> getCart(){
		return (List<Cart>)cr.findAll();
	}
	@RequestMapping(method=RequestMethod.GET,value="/cart/{id}")
	public Optional<Cart> getCartid(@PathVariable int id){
		try {
		Optional<Cart> li= cr.findById(id);
		return li;
	}
		catch(Exception e) {
			return null;
		}
	}
	@RequestMapping(method=RequestMethod.POST,value="/cart/{email}")
	public Cart postCart(@RequestBody Productlist pl,@PathVariable String email){
     Cart c=new Cart(pl.getId(),pl.getSpect(),pl.getPrice(),pl.getImage(),new Email(email));
		return cr.save(c);
		
	}
	@RequestMapping(method=RequestMethod.GET,value="/usercart/{mail}")
	public List<Cart> getCartById(@PathVariable String mail ){
		try {
			List<Cart> c=cr.findByCeidMail(mail);
		return c;
	}
		catch(Exception e) {
			return null;
		}
		}
	@RequestMapping(method=RequestMethod.DELETE,value="/delete/{id}")
	public void delById(@PathVariable int id) {
		cr.deleteById(id);
	}
	@RequestMapping(method=RequestMethod.DELETE,value="/deleteall/{mail}")
	public void delall(@PathVariable String mail) {
		List<Cart> ct= cr.findByCeidMail(mail);
		for(int i=0;i<ct.size();i++) {
			if(ct.get(i)!=null) {
			Cart d=ct.get(i);
		    cr.delete(d);
	}
	}
	}
	

}
