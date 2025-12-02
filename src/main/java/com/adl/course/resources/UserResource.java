package com.adl.course.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.adl.course.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

	@GetMapping
	public ResponseEntity<User> finAll() {
		User u = new User(1L, "Maria", "maria@gmail.com", "999999", "1234");
		return ResponseEntity.ok().body(u);

	}

}
