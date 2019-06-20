package com.app.runner;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Component;

import com.app.model.Producct;
import com.app.repo.ProductRepo;

@Component
public class AppRunner implements CommandLineRunner {

	@Autowired
	private ProductRepo repo;
	
	@Override
	public void run(String... args) throws Exception 
	{
		
		
		  repo.save(new Producct(10,"A",3.3)); 
		  repo.save(new Producct(11,"i",4.3));
		  repo.save(new Producct(12,"b",5.3)); 
		  repo.save(new Producct(13,"j",6.3));
		  repo.save(new Producct(14,"c",7.3)); 
		  repo.save(new Producct(15,"k",8.3));
		  repo.save(new Producct(16,"d",2.3)); 
		  repo.save(new Producct(17,"l",1.3));
		  repo.save(new Producct(18,"e",9.3)); 
		  repo.save(new Producct(19,"n",4.7));
		  repo.save(new Producct(20,"f",8.3));
		 
		
		//repo.save(new Producct(20,"o",7.4));
		
		//--------fetch one row 
		/*
		 * Optional<Producct> p = repo.findById(18); System.out.println(p);
		 * 
		 *fetch all data
		 * List<Producct> list = repo.findAll(); list.forEach(System.out::println);
		 */
		
		//delete operations----------------------
		//repo.deleteById(10);
		
		//repo.deleteAll();
		//repo.deleteAll();
		
		//repo.deleteAllInBatch();
		
		/*
		 * List<Producct> prods = Arrays.asList(new Producct(101,"R",2.9), new
		 * Producct(123,"s",1.9), new Producct(128,"d",0.9), new Producct(129,"j",9.9),
		 * new Producct(189,"k",7.9), new Producct(191,"l",8.9) ); repo.saveAll(prods);
		 */
		
		/*
		 * Optional<Producct> p = repo.findById(101); if(p.isPresent()) { //avoid null
		 * pointer error Producct prod = p.get();
		 * System.out.println(prod.getProdCode()); } else {
		 * System.out.println("row is not found"); }
		 */
		//repo.deleteAll();
		
	
		}

}
