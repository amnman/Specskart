package com.lenskart.main.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.lenskart.main.model.RegisterMain;

@Repository
public interface RegisterRepo extends CrudRepository<RegisterMain,String>{

}
