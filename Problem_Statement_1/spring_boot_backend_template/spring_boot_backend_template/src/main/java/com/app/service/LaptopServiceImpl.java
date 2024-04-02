package com.app.service;

import java.util.List;

import org.modelmapper.ModelMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.custom_exceptions.ResourceNotFoundException;
import com.app.dao.LaptopDao;
import com.app.dao.PersonDao;
import com.app.dto.LaptopDTO;
import com.app.entitites.Laptop;
import com.app.entitites.Person;

@Service
@Transactional
public class LaptopServiceImpl implements LaptopService {
	
	@Autowired
	LaptopDao laptopDao;
	
	@Autowired
	ModelMapper mapper;
	
	@Autowired
	PersonDao personDao;

	@Override
	public LaptopDTO addLaptopDetails(Long pid ,LaptopDTO dto) {
		
		Person person = personDao.findById(pid)
				.orElseThrow(()-> new ResourceNotFoundException("Id not found "));
		Laptop laptop = mapper.map(dto, Laptop.class);
		laptop.setPersonId(person);
		Laptop savedLap =laptopDao.save(laptop);
		
//		laptop.setNameOfLaptop(dto.getNameOfLaptop());
//		laptop.setPriceOfLaptop(dto.getPriceOfLaptop());
//		laptop.setTypeOfLaptop(dto.getTypeOfLaptop());
		
		
		
		
		return mapper.map(savedLap, LaptopDTO.class);
	}
	
}
