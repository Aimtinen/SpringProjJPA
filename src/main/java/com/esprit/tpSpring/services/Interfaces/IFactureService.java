package com.esprit.tpSpring.services.Interfaces;


import java.util.List;

import com.esprit.tpSpring.entity.Facture;


public interface IFactureService {
	List<Facture> retrieveAllFactures();
	void cancelFacture(Long id);
	Facture retrieveFacture(Long id);

}
