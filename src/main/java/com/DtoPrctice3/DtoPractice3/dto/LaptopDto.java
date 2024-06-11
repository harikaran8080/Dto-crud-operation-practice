package com.DtoPrctice3.DtoPractice3.dto;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
public class LaptopDto {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int laptopNo;
	
	private String laptopName;
	
	private String LaptopColur;  

}
