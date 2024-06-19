package com.DtoPrctice3.DtoPractice3.service;



import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;

import com.DtoPrctice3.DtoPractice3.dto.LaptopDto;
import com.DtoPrctice3.DtoPractice3.dto.PaginationResponse;
import com.DtoPrctice3.DtoPractice3.entity.Laptops;

import jakarta.annotation.Resource;

public interface ServiceImplement {

	LaptopDto post(LaptopDto dto);

	List<LaptopDto> postall(List<LaptopDto> dtos);

	LaptopDto get(int laptopNo);

	List<LaptopDto> getall();

	LaptopDto update(LaptopDto dto);

	String delete(int laptopNo);

	ResponseEntity<PaginationResponse<Laptops>> resource(int page, int size);

	Page<Laptops> getvalues(int page, int size);

	PaginationResponse<Laptops> geter(int page, int size);

	

	



	

}
