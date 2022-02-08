package com.bacancy.dto;

import java.time.LocalDateTime;

import com.bacancy.entity.User;


public class MessageDto {

	private Long id;
	private String message;
	private LocalDateTime sendDateTime;
	private UserDto sender;
	private User reciever;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public LocalDateTime getSendDateTime() {
		return sendDateTime;
	}
	public void setSendDateTime(LocalDateTime sendDateTime) {
		this.sendDateTime = sendDateTime;
	}
	public UserDto getSender() {
		return sender;
	}
	public void setSender(UserDto sender) {
		this.sender = sender;
	}
	public User getReciever() {
		return reciever;
	}
	public void setReciever(User reciever) {
		this.reciever = reciever;
	}
	
	
}
