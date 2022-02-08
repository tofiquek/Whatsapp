package com.bacancy.service;

import java.util.List;

import com.bacancy.dto.GroupDto;
import com.bacancy.dto.UserDto;

public interface GroupService {

GroupDto add(GroupDto groupDto);
	
	GroupDto get(Long id);
	
	List<GroupDto> all();
	
	void delete(Long id);
}
