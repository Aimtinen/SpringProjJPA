package com.esprit.tpSpring.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.esprit.tpSpring.entity.Rayon;

@Repository
public interface RayonRepository  extends CrudRepository <Rayon , Long> {

}
