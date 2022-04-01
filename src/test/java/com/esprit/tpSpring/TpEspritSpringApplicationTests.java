package com.esprit.tpSpring;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.esprit.tpSpring.entity.Stock;
import com.esprit.tpSpring.repositories.StockRepository;

/**
 * @author Imtinen
 *
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class TpEspritSpringApplicationTests {

	@Autowired
	StockRepository stockRepository; 
	
	
	@Test
	public void testAddStock() {
		Stock s = new Stock();
		s.setLibelleStock("test ");
		s.setQteStock(10);
		s.setQteMin(100);
		stockRepository.save(s);
	
	}
	
	@Test
	public void testDeleteStock() {
		
		stockRepository.deleteById(2L);
	
	}
	
	

}

