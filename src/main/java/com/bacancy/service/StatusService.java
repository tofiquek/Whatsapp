package com.bacancy.service;

import java.util.List;

import com.bacancy.dto.StatusDto;

public interface StatusService {

StatusDto add(StatusDto statusDto);
	
	StatusDto get(Long id);
	
	List<StatusDto> all();
	
	void delete(Long id);
}
