package com.esprit.tpSpring.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.esprit.tpSpring.entity.Role;


@Repository
public interface RoleRepository extends CrudRepository <Role , Integer> {
	
		Role findByRole(String role);
	
}
