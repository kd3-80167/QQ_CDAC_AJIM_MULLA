package com.app.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.dto.PersonDTO;
import com.app.service.PersonService;



@RestController
@RequestMapping("/person")
public class PersonController {
	
	@Autowired
	private PersonService personService;
	
	@GetMapping("/{perId}")
	public PersonDTO showPersonDetails(@PathVariable("perId") Long perId){
	    return personService.showPersonDetails(perId);
	}

	
	@PostMapping("/addPerson")
	public PersonDTO addNewPerson(@RequestBody @Valid PersonDTO dto) {
		
		return personService.addNewPerson(dto);
	}

}
