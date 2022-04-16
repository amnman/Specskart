package com.lenskart.main.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lenskart.main.model.Email;

@Repository
public interface EmailRepo extends JpaRepository<Email,String>{

}
