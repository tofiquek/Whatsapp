package com.bacancy.entity;

import java.time.LocalDateTime;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "message")
public class Message {

	@Id
	@GeneratedValue
	@Column(name = "id")
	private Long id;
	
	@Column(name = "message")
	private String message;
	
	@Column(name = "send_datetime")
	private LocalDateTime sendDateTime;

	@OneToOne(cascade = CascadeType.ALL)
	private User sender;
	
	@OneToOne(cascade = CascadeType.ALL)
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

	public User getSender() {
		return sender;
	}

	public void setSender(User sender) {
		this.sender = sender;
	}

	public User getReciever() {
		return reciever;
	}

	public void setReciever(User reciever) {
		this.reciever = reciever;
	}
	
	
	
}
