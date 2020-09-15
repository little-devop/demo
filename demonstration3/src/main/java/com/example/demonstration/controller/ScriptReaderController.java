package com.example.demonstration.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demonstration.entities.ScriptReader;

public class ScriptReaderController {
	

	@RequestMapping(value="/addSC", method= RequestMethod.POST, produces= MediaType.APPLICATION_JSON_VALUE,consumes= MediaType.APPLICATION_JSON_VALUE)
	public String addScriptReader(@RequestBody ScriptReader sr) {
		
		
		return "testTexte";
	

}
}
