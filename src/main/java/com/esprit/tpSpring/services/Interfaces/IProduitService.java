package com.esprit.tpSpring.services.Interfaces;

import java.util.List;

import com.esprit.tpSpring.entity.Produit;

public interface IProduitService {
	List<Produit> retrieveAllProduits();

	boolean addProduit(Produit p, Long idRayon, Long idStock);

	Produit retrieveProduit(Long id);

}
