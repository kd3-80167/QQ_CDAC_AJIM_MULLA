package com.app.service;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.custom_exceptions.ResourceNotFoundException;
import com.app.dao.PersonDao;
import com.app.dto.PersonDTO;
import com.app.entitites.Person;

@Service
@Transactional
public class PersonServiceImpl implements PersonService {

	@Autowired
	private PersonDao personDao;
	
	@Autowired
	private ModelMapper mapper;
	@Override
	public PersonDTO addNewPerson(PersonDTO dto) {
		Person person = mapper.map(dto, Person.class);
Person per = personDao.save(person);
		return mapper.map(per, PersonDTO.class);
	}
	@Override
	public PersonDTO showPersonDetails(Long id) {
		// TODO Auto-generated method stub
		Person person = personDao.findById(id).orElseThrow(()-> new ResourceNotFoundException("ID not found"));
		
		return mapper.map(person, PersonDTO.class);
	}

	

}
