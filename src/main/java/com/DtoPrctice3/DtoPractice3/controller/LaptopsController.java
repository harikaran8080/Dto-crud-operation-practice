package com.DtoPrctice3.DtoPractice3.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.DtoPrctice3.DtoPractice3.dto.LaptopDto;
import com.DtoPrctice3.DtoPractice3.dto.PaginationResponse;
import com.DtoPrctice3.DtoPractice3.entity.Laptops;
import com.DtoPrctice3.DtoPractice3.service.ServiceImplement;


@RestController
@RequestMapping("/Laptop/api")
public class LaptopsController {

	@Autowired
	private ServiceImplement implement;

	@PostMapping("/post")
	public LaptopDto post(@RequestBody LaptopDto dto) {
		return implement.post(dto);
	}

	@PostMapping("/postall")
	public List<LaptopDto> postall(@RequestBody List<LaptopDto> dtos) {
		return implement.postall(dtos);

	}

	@GetMapping("/get/{laptopNo}")
	public LaptopDto get(@PathVariable int laptopNo) {
		return implement.get(laptopNo);
	}

	@GetMapping("/getall")
	public List<LaptopDto> getall() {
		return implement.getall();
	}

	@PutMapping("/update")
	public LaptopDto update(@RequestBody LaptopDto dto) {
		return implement.update(dto);
	}

	@DeleteMapping("/delete/{laptopNo}")
	public String delete(@PathVariable int laptopNo) {
		return implement.delete(laptopNo);

	}
////*********************************************-----********************************--------*******************************************
	@GetMapping("/resource")
	public ResponseEntity<PaginationResponse<Laptops>> getallresource(
			@RequestParam (value = "page") int page,
			@RequestParam (value = "size")int size){
		return implement.resource(page,size);
		
	}
	
	@GetMapping("/getvalues/{page}/{size}")
	public Page<Laptops>getvalues(@PathVariable int page,@PathVariable int size){
		return implement.getvalues(page,size);
	}
	
	@GetMapping("/geter/{page}/{size}")
	public PaginationResponse<Laptops> geter(@PathVariable int page,@PathVariable int size){
		return implement.geter(page,size);
	}
	
	
	

}
