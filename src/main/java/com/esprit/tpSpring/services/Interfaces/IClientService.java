package com.esprit.tpSpring.services.Interfaces;

import java.util.List;

import com.esprit.tpSpring.entity.Client;

public interface IClientService {

	List<Client> retrieveAllClients();
	Client addClient(Client c);
	void deleteClient(Long id);
	Client updateClient(Client c);
	Client retrieveClient(Long id); 
	
}
