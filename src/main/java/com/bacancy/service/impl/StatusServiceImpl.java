package com.bacancy.service.impl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import com.bacancy.dto.StatusDto;
import com.bacancy.dto.UserDto;
import com.bacancy.entity.Status;
import com.bacancy.entity.User;
import com.bacancy.repository.StatusRepository;
import com.bacancy.repository.UserRepository;
import com.bacancy.service.StatusService;

public class StatusServiceImpl implements StatusService {

	@Autowired
	private ModelMapper modelMapper;
	
	@Autowired
	private StatusRepository statusRepository;
	
	@Override
	public StatusDto add(StatusDto statusDto) {
		Status status = modelMapper.map(statusDto, Status.class);
		Status savedStatus= statusRepository.save(status);
		StatusDto savedStatusDto = modelMapper.map(savedStatus, StatusDto.class);
		return savedStatusDto;
	}

	@Override
	public StatusDto get(Long id) {
		Optional<Status> statusOptional = statusRepository.findById(id);
		StatusDto  statusDto = null;
		if (statusOptional.isPresent()) {
			
			statusDto = modelMapper.map(statusOptional.get(), StatusDto.class);
		}
		return statusDto;
	}

	@Override
	public List<StatusDto> all() {
		List<Status> statuss = statusRepository.findAll();
		List<StatusDto> statusDto = statuss.stream().map(status -> modelMapper.map(status, StatusDto.class)).collect(Collectors.toList());
		return statusDto;
	}

	@Override
	public void delete(Long id) {
		statusRepository.deleteById(id);
	}

}
