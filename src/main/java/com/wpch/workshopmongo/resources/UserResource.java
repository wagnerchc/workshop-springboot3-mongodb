package com.wpch.workshopmongo.resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wpch.workshopmongo.domain.User;

@RestController
@RequestMapping(value="/users")
public class UserResource {

	@GetMapping
	public ResponseEntity<List<User>> findAll(){
		User u1 = new User(null, "Wagner", "w.chequeleiro@gmail.com");
		User u2 = new User(null, "Aline", "aline@gmail.com");
		List<User> list = new ArrayList<>();
		list.addAll(Arrays.asList(u1, u2));
		return ResponseEntity.ok().body(list);
	}
	
}