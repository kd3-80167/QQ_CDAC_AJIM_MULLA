package com.app.entitites;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Entity
@Table(name = "laptop")

public class Laptop extends BaseEntity {
	@Column(name = "laptop_name", length = 30, unique = true)
	private String nameOfLaptop;
	
	@Column(name = "laptop_type", length = 40, unique = false)
	private String typeOfLaptop;
	
	@Column(name = "laptop_price")
	private int priceOfLaptop;

	// this one is the unidirectional association where 
	// Person has many laptop that's why we took this side as many
	// and laptop has no control over the person so we didn't take any 
	// relation for @OneToMany side
	
	@ManyToOne 
	@JoinColumn(name = "Person_id",nullable = false)
	private Person personId;
}
