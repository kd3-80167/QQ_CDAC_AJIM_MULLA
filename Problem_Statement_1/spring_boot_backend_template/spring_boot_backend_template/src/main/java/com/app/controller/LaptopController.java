package com.app.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.app.dto.LaptopDTO;
import com.app.service.LaptopService;

@RestController // Now we are working on a REST API then we'll have to use the RESTCONTROLLER
@RequestMapping("/laptops")

public class LaptopController {
	
	@Autowired(required = true)
	private LaptopService laptopService;
	
	
//	@GetMapping
//	public List<Laptop> listLaptop(){
//		System.out.println("in the list of Laptop");
//		return lapService.getAllLaptops();
//	}
	
//	@PostMapping("/add")
//	public LaptopDTO addLaptopDetails(@RequestBody @Valid LaptopDTO lap) {
//		System.out.println("in the addLaptopDetails ");
//		return laptopService.addLaptopDetails(lap);
//	}
	
	@PostMapping("/addLappy/{pid}")
	public ResponseEntity<LaptopDTO> addLappy(@RequestParam Long pid , @Valid @RequestBody   LaptopDTO dto)
	{
		LaptopDTO ldto = laptopService.addLaptopDetails(pid, dto);
				return ResponseEntity.ok(ldto);
	}

}
