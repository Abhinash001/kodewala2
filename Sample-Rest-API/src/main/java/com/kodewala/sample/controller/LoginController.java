package com.kodewala.sample.controller;

import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kodewala.sample.controller.dto.LoginDTO;
import com.kodewala.sample.controller.response.LoginResponse;

@RestController // @Controller + REST Controller
@RequestMapping("/user/api/") // In simple words:It tells your application “If this URL is called → run this
								// method.”

public class LoginController {

	// handler method
	@GetMapping("login")
	public ResponseEntity<LoginResponse> doLogin(@RequestBody LoginDTO request) {

		System.out.println(" user name " + request.getUser());
		
		LoginResponse loginresponse = new LoginResponse();
		loginresponse.setMessage(" Login success");
		
		return ResponseEntity.ok(loginresponse);
	}
}
