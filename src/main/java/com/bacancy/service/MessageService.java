package com.bacancy.service;

import java.util.List;

import com.bacancy.dto.MessageDto;

public interface MessageService {

MessageDto add(MessageDto messageDto);
	
	MessageDto get(Long id);
	
	List<MessageDto> all();
	
	void delete(Long id);
}
