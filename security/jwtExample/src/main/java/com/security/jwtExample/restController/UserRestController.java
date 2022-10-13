package com.security.jwtExample.restController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.security.jwtExample.domain.User;
import com.security.jwtExample.service.UserService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class UserRestController {

	private final UserService userService;

	@GetMapping("/getUsers")
	public ResponseEntity<List<User>> getUsers() {

		List<User> users = userService.getUsers();

		return ResponseEntity.ok().body(users);
	}

}
