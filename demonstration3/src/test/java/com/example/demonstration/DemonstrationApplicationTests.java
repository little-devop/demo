package com.example.demonstration;

import static org.junit.jupiter.api.Assertions.assertEquals;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.AutoConfigureTestEntityManager;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import com.example.demonstration.dao.repository.UserRepository;
import com.example.demonstration.entities.User;

@SpringBootTest
@AutoConfigureTestEntityManager
@Transactional
class DemonstrationApplicationTests {

	@Autowired
	private TestEntityManager testEntityManager;
	
	@Autowired
	private UserRepository customerRep;

	@Test
	void contextLoads() {
	}
	
	@Test
	void find() {
		
		User object = new User("firstname", "last");
		testEntityManager.persist(object);
		User custList = customerRep.findByLastName("last");
		//User cust = custList.get(0);
		assertEquals(object.getLastName(), custList.getLastName());
		
		
		
	}

}
