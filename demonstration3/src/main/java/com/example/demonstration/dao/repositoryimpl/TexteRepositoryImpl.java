package com.example.demonstration.dao.repositoryimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import com.example.demonstration.dao.repository.TexteRepository;
import com.example.demonstration.entities.Texte;
import com.example.demonstration.entities.User;

@Service
public class TexteRepositoryImpl  {
	
	@Autowired TexteRepository texteRepository;

	@Query()
	public List<Texte> findAllTexteByUser(User user) {
		return texteRepository.findAllTexteByUser(user);
	}

}
