package com.esprit.tpSpring.services.Interfaces;

import java.util.List;

import com.esprit.tpSpring.entity.Stock;


public interface IStockService {
	
	List<Stock> retrieveAllStocks();
	boolean addStock(Stock s);
	Stock updateStock(Stock u);
	Stock retrieveStock(Long id);

}
