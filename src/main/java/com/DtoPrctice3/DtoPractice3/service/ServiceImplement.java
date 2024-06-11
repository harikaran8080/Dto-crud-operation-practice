package com.DtoPrctice3.DtoPractice3.service;



import java.util.List;

import com.DtoPrctice3.DtoPractice3.dto.LaptopDto;

public interface ServiceImplement {

	LaptopDto post(LaptopDto dto);

	List<LaptopDto> postall(List<LaptopDto> dtos);

	LaptopDto get(int laptopNo);

	List<LaptopDto> getall();

	LaptopDto update(LaptopDto dto);

	String delete(int laptopNo);

	;



	

}
