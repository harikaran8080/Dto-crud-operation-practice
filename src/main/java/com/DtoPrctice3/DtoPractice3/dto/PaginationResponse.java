package com.DtoPrctice3.DtoPractice3.dto;

import java.util.List;

import lombok.Data;

@Data
public class PaginationResponse<T> {
	
	private List<T> content;
	
	private int pageNo;
	
	private int pageSize;
	
	private long totalElements;
	
	private int totalPage;
	
	private boolean last;
	
	

}
