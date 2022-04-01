package com.esprit.tpSpring.services.Impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.esprit.tpSpring.entity.Facture;
import com.esprit.tpSpring.repositories.FactureRepository;
import com.esprit.tpSpring.services.Interfaces.IFactureService;

import lombok.extern.slf4j.Slf4j;


@Service
@Slf4j
public class FactureServiceImpl implements IFactureService{
	
	
	@Autowired
	private FactureRepository factureRepository;

	@Override
	public List<Facture> retrieveAllFactures() {
		List<Facture> list = new ArrayList<>();
		factureRepository.findAll().forEach(e -> list.add(e));
		for(Facture facture : list) {
			log.info("Facture: "+facture);
		}
		return list;
	}

	@Override
	public void cancelFacture(Long id) {
		Facture f = retrieveFacture(id);
		f.setActive(false);
		
	}

	@Override
	public Facture retrieveFacture(Long id) {
		Facture obj = factureRepository.findById(id).get();
		return obj;
	}
	
	
	
	

}
