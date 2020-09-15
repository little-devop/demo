package com.example.demonstration.dao.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demonstration.entities.Texte;
import com.example.demonstration.entities.User;

@Repository
public interface TexteRepository extends JpaRepository<Texte, Long>{

	Texte findBytitre(String titre);
	List<Texte> findAllTexteByUser(User user);
	
	
	
}
