package com.bacancy.dto;

import java.time.LocalDateTime;

public class GroupDto {

	private Long id;
	private String name;
	private String groupPic;
	private UserDto createdBy;
	private LocalDateTime createdDateTime;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGroupPic() {
		return groupPic;
	}
	public void setGroupPic(String groupPic) {
		this.groupPic = groupPic;
	}
	public UserDto getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(UserDto createdBy) {
		this.createdBy = createdBy;
	}
	public LocalDateTime getCreatedDateTime() {
		return createdDateTime;
	}
	public void setCreatedDateTime(LocalDateTime createdDateTime) {
		this.createdDateTime = createdDateTime;
	}
	
	
}
