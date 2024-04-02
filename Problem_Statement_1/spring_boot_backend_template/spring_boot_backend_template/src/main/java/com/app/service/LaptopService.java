package com.app.service;


import java.util.List;

import com.app.dto.LaptopDTO;
import com.app.entitites.*;

public interface LaptopService {
	
	LaptopDTO addLaptopDetails(Long pid ,LaptopDTO dto);
}
