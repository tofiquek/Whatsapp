package com.bacancy.service.impl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import com.bacancy.dto.MessageDto;
import com.bacancy.entity.Message;
import com.bacancy.repository.MessageRepository;
import com.bacancy.service.MessageService;

public class MessageServiceImpl implements MessageService{
	
	@Autowired
	private ModelMapper modelMapper;
	
	@Autowired
	private MessageRepository messageRepository;

	@Override
	public MessageDto add(MessageDto messageDto) {
		Message message = modelMapper.map(messageDto, Message.class);
		Message savedMessage = messageRepository.save(message);
		MessageDto savedMessageDto = modelMapper.map(savedMessage, MessageDto.class);
		return savedMessageDto;
	}

	@Override
	public MessageDto get(Long id) {
		Optional<Message> messageOptional = messageRepository.findById(id);
		MessageDto messageDto = null;
		if (messageOptional.isPresent()) {
			
			messageDto = modelMapper.map(messageOptional.get(), MessageDto.class);
		}
		return messageDto;
	}

	@Override
	public List<MessageDto> all() {
		List<Message> messages = messageRepository.findAll();
		List<MessageDto> messageDto = messages.stream().map(message -> modelMapper.map(message, MessageDto.class)).collect(Collectors.toList());
		return messageDto;
	}

	@Override
	public void delete(Long id) {
		messageRepository.deleteById(id);;
		
	}

}
