package com.bacancy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bacancy.dto.UserDto;
import com.bacancy.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;
	
	@PostMapping
	public ResponseEntity<UserDto> addUser(@RequestBody UserDto userDto){
		return new ResponseEntity<UserDto>(userService.add(userDto), HttpStatus.OK);
	}
	
	@GetMapping
	public ResponseEntity<List<UserDto>> findAllUsers(){
		List<UserDto> users = userService.all();
		return new ResponseEntity(users, HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<UserDto> findUser(@PathVariable(name = "id") Long id) {
		return new ResponseEntity<UserDto>( userService.get(id),HttpStatus.OK);
	}
	
	
	@DeleteMapping("/{id}")
	public ResponseEntity deleteUser(@PathVariable(name="id") Long id) {
		userService.delete(id);
		return new ResponseEntity(HttpStatus.OK); 
	}
}
