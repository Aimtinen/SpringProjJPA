package com.esprit.tpSpring.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.esprit.tpSpring.entity.Client;
import com.esprit.tpSpring.entity.Stock;

@Repository
public interface StockRepository extends CrudRepository <Stock , Long> {

	@Query("SELECT s FROM Stock s WHERE s.idStock= :idStock")
	List<Client> retrieveStock(@Param("idStock")  Long idStock);

	
}
