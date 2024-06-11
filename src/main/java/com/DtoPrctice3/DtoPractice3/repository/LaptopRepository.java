package com.DtoPrctice3.DtoPractice3.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.DtoPrctice3.DtoPractice3.entity.Laptops;

@Repository
public interface LaptopRepository extends JpaRepository<Laptops, Integer>{

}
