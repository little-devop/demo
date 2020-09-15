package com.example.demonstration;



import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import org.springframework.transaction.annotation.Transactional;

import com.example.demonstration.constants.UserType;
import com.example.demonstration.dao.repository.TexteRepository;
import com.example.demonstration.dao.repository.UserRepository;
import com.example.demonstration.entities.Texte;
import com.example.demonstration.entities.User;

@SpringBootApplication

public class DemonstrationApplication {

	private static final Logger log = LoggerFactory.getLogger(DemonstrationApplication.class);

	  public static void main(String[] args) {
	    SpringApplication.run(DemonstrationApplication.class);
	  }

	  @Bean
	 @Transactional
	  public CommandLineRunner demo(UserRepository repository, TexteRepository texteRepository) {
	    return (args)-> {
	      // save a few customers
	 //String firstName, String lastName, Integer age, String motDePasse, String pseudo, String nationality, String adresse, Role roles
	    	repository.save(new User("alex"," brent"));
	    	repository.save(new User())
	  
	      // fetch all customers
	      log.info("Customers found with findAll():");
	      log.info("-------------------------------");
	      for (User customer : repository.findAll()) {
	        log.info(customer.toString());
	      }
	      

	      // fetch an individual customer by ID
	      User customer = repository.getOne(1L);
	      log.info("Customer found with findById(1L):");
	      log.info("--------------------------------");
	      log.info(customer.toString());
	      log.info("");
	      
	      User user2 = repository.findByLastName("Palmer");
	      User user2Del = repository.findByLastName("Dessler");
	      repository.delete(user2Del);
	      
	 
	      
			  texteRepository.save(new Texte("le journal de guliberd","Martin","une epoper sombre", new Date(), null, user2));
		      texteRepository.save( new Texte("Journal de bord","Jean de la fontaine","il etait" +user.getFirstName()+ " une fois un lapn s'amusais dans ca niche",  new Date(), null,user));  
		      texteRepository.save(new Texte("bebe cul","sherder","Dans une ville de manathan la ou les herbe pousse", new Date(), null, customer));
		           
	    	
	    	
	    	
	    	
		      Texte test= texteRepository.getOne(1L);
		      test.setContenu(" bla la blza blablza");
		      texteRepository.save(test);
		      

	      // fetch customers by last name
	      log.info("Customer found with findByLastName('Bauer'):");
	      log.info("--------------------------------------------");
//	      repository.findByLastName("Bauer").forEach(bauer -> {
//	        log.info(bauer.toString());
//	      });
//	      // for (Customer bauer : repository.findByLastName("Bauer")) {
//	      //  log.info(bauer.toString());
//	      // }
//	      log.info("");
	    }; 
	    
	
	  }
	  }
	
