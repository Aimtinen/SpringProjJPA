package com.esprit.tpSpring.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.esprit.tpSpring.entity.Fournisseur;


@Repository
public interface FournisseurRepository extends CrudRepository <Fournisseur , Long> {

}
