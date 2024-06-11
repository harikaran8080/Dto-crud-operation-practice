package com.DtoPrctice3.DtoPractice3.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.DtoPrctice3.DtoPractice3.dto.LaptopDto;
import com.DtoPrctice3.DtoPractice3.entity.Laptops;
import com.DtoPrctice3.DtoPractice3.repository.LaptopRepository;

@Service
public class LaptopService implements ServiceImplement{
	
	@Autowired
	private LaptopRepository laptopRepository;

	@Override
	public LaptopDto post(LaptopDto dto) {
		Laptops laptops=new Laptops();
		laptops.setLaptopColur(dto.getLaptopColur());
		laptops.setLaptopName(dto.getLaptopName());
		laptops.setLaptopNo(dto.getLaptopNo());
		laptopRepository.save(laptops);
		return dto;
		
	}

	@Override
	public List<LaptopDto> postall(List<LaptopDto> dtos) {
		List<Laptops>laptops=new ArrayList<Laptops>();
		for(LaptopDto dto:dtos) {
			Laptops laptops1=new Laptops();
			laptops1.setLaptopColur(dto.getLaptopColur());
			laptops1.setLaptopName(dto.getLaptopName());
			laptops1.setLaptopNo(dto.getLaptopNo());
			laptops.add(laptops1);
		}
		List<Laptops>laptops2=laptopRepository.saveAll(laptops);
		List<LaptopDto>dtos2=new ArrayList<LaptopDto>();
		for(Laptops laptops3:laptops2) {
			LaptopDto dto=new LaptopDto();
			dto.setLaptopColur(laptops3.getLaptopColur());
			dto.setLaptopName(laptops3.getLaptopName());
			dto.setLaptopNo(laptops3.getLaptopNo());
			dtos2.add(dto);
		}
		return dtos2;
	}

	@Override
	public LaptopDto get(int laptopNo) {
		Optional<Laptops>optional=laptopRepository.findById(laptopNo);
		Laptops laptops=optional.get();
		LaptopDto dto=new LaptopDto();
		dto.setLaptopColur(laptops.getLaptopColur());
		dto.setLaptopName(laptops.getLaptopName());
		dto.setLaptopNo(laptops.getLaptopNo());
		laptopRepository.save(laptops);
		return dto;
		}

	@Override
	public List<LaptopDto> getall() {
		List<Laptops> laptops=laptopRepository.findAll();
		List<LaptopDto>dtos=new ArrayList<LaptopDto>();
		for(Laptops laptops2:laptops) {
			LaptopDto dto=new LaptopDto();
			dto.setLaptopColur(laptops2.getLaptopColur());
			dto.setLaptopName(laptops2.getLaptopName());
			dto.setLaptopNo(laptops2.getLaptopNo());
			dtos.add(dto);
		}
		
		return dtos;
		
	}

	@Override
	public LaptopDto update(LaptopDto dto) {
		Optional<Laptops>optional=laptopRepository.findById(dto.getLaptopNo());
		Laptops laptops=optional.get();
		laptops.setLaptopColur(dto.getLaptopColur());
		laptops.setLaptopName(dto.getLaptopName());
		laptops.setLaptopNo(dto.getLaptopNo());
		laptopRepository.save(laptops);
		return dto;
	}

	@Override
	public String delete(int laptopNo) {
		laptopRepository.deleteById(laptopNo);
		return "Delete Panniyachu kilampu";
	}


	
	

}
