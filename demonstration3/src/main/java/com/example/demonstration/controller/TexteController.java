package com.example.demonstration.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demonstration.dao.repository.TexteRepository;
import com.example.demonstration.entities.ScriptReader;
import com.example.demonstration.entities.Texte;

@RestController
@RequestMapping("/texte")
public class TexteController {


		
		@Autowired
		TexteRepository texteRepository;

		@RequestMapping(value="/add", method= RequestMethod.POST, produces= MediaType.APPLICATION_JSON_VALUE,consumes= MediaType.APPLICATION_JSON_VALUE)
		public String addTexte(@RequestBody Texte texte) {
			
			
			return "testTexte";
		}
		
		@GetMapping (value="/get/{titre}",  produces= MediaType.APPLICATION_JSON_VALUE)
		public Texte getTexteBytitre(@PathVariable String titre) {
			
		Texte texte = texteRepository.findBytitre(titre);
			
			return texte;
		}
		
		@RequestMapping(value="/addSC", method= RequestMethod.POST, produces= MediaType.APPLICATION_JSON_VALUE,consumes= MediaType.APPLICATION_JSON_VALUE)
		public String addScriptReader(@RequestBody ScriptReader sr) {
			
			
			return "testTexte";
		
	}
}
