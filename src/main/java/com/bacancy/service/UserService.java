package com.bacancy.service;

import java.util.List;

import com.bacancy.dto.UserDto;

public interface UserService {

	UserDto add(UserDto userDto);
	
	UserDto get(Long id);
	
	List<UserDto> all();
	
	void delete(Long id);
}
