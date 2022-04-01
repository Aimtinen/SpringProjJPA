package com.esprit.tpSpring.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.esprit.tpSpring.entity.DetailFacture;


@Repository
public interface DetailFactureRepository  extends CrudRepository <DetailFacture , Long> {

}
