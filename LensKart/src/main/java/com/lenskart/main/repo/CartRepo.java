package com.lenskart.main.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.lenskart.main.model.Cart;

@Repository
public interface CartRepo extends CrudRepository<Cart, Integer> {

	List<Cart> findByCeidMail(String em);

	void deleteByCeidMail(String mail);

}
