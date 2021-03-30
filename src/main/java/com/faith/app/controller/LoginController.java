package com.faith.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.faith.app.entity.EmpLogin;
import com.faith.app.entity.EmpRole;

import com.faith.app.service.ILoginService;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class LoginController {

	@Autowired
	private ILoginService loginService;

	// get all roles
	@GetMapping("/login")
	public List<EmpLogin> getAllLogin() {
		return loginService.getAllLogin();

	}

	@GetMapping("user-login/{username}&{password}")
	public ResponseEntity<EmpLogin> listUser(@PathVariable("username") String username,
			@PathVariable("password") String password) {

		ResponseEntity<EmpLogin> response = null;
		EmpLogin user = loginService.findUser(username, password);
		if (user == null) {
			response = new ResponseEntity<EmpLogin>(HttpStatus.NOT_FOUND);
		} else {
			response = new ResponseEntity<EmpLogin>(user, HttpStatus.OK);
		}

		return response;

	}

}
