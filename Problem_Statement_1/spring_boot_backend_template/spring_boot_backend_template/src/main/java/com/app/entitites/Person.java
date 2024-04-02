package com.app.entitites;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.app.dto.PersonDTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "person")
public class Person extends BaseEntity {
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "mobile_no",length = 13)
	private String mobNo;
	
	
	
}
