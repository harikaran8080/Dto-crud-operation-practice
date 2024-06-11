package com.DtoPrctice3.DtoPractice3.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="laptops")
public class Laptops {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int laptopNo;
	
	private String laptopName;
	
	private String LaptopColur;

}
