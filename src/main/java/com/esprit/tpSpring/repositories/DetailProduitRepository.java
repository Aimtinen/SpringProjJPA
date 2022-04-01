package com.esprit.tpSpring.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.esprit.tpSpring.entity.DetailProduit;

@Repository
public interface DetailProduitRepository extends CrudRepository <DetailProduit , Long> {

}
