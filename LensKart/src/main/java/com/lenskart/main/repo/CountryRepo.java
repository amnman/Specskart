package com.lenskart.main.repo;

import org.springframework.data.repository.CrudRepository;


import com.lenskart.main.model.Country;


public interface CountryRepo extends CrudRepository<Country,Long>{

}
