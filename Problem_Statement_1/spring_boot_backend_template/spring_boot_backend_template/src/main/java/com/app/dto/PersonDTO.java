package com.app.dto;

import javax.persistence.Column;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@ToString
public class PersonDTO {
	
	@JsonProperty(access = Access.READ_ONLY) // it will only serialize to JSON during deserialization  JSON can't change the id
	private Long id;
	
	@Max(300)
	private String name;
	
	@Min(10)
	private String mobNo;
}
