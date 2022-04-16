package com.lenskart.main.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lenskart.main.model.Bookings;

@Repository
public interface BookingRepo extends JpaRepository<Bookings,Integer>{

	List<Bookings> findByEidMail(String mail);

}
