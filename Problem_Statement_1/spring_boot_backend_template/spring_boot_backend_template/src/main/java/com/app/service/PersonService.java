package com.app.service;

import java.util.List;

import com.app.dto.PersonDTO;

public interface PersonService {
	PersonDTO addNewPerson(PersonDTO dto);

	PersonDTO showPersonDetails(Long id);

}
