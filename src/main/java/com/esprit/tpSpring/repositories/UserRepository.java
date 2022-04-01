package com.esprit.tpSpring.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.esprit.tpSpring.entity.User;

@Repository
public interface UserRepository extends CrudRepository <User , Long> {
	 
		User findByUserName(String userName);
}
