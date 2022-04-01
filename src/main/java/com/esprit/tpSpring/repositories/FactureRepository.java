package com.esprit.tpSpring.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.esprit.tpSpring.entity.Facture;

@Repository
public interface FactureRepository extends CrudRepository <Facture , Long> {

}
