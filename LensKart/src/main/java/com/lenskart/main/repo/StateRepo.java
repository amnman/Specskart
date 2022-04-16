package com.lenskart.main.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lenskart.main.model.State;


@Repository
public interface StateRepo extends JpaRepository<State,Long> {

	List<State> findByCId(long cid);

}
