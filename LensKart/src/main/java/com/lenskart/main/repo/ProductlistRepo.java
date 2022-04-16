package com.lenskart.main.repo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.lenskart.main.model.Productlist;

@Repository
public interface ProductlistRepo extends CrudRepository <Productlist ,Integer>
{

}
