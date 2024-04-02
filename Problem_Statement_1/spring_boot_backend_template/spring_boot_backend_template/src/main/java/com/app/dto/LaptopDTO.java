package com.app.dto;

import javax.persistence.Column;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class LaptopDTO {

	
private String nameOfLaptop;

	@JsonProperty(access = Access.READ_ONLY)
	private Long id;
	
	private String typeOfLaptop;
	
	private int priceOfLaptop;
}
