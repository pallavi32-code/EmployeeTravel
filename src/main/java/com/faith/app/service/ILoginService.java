package com.faith.app.service;

import java.util.List;

import com.faith.app.entity.EmpLogin;


public interface ILoginService {
	
	// view all roles
	List<EmpLogin> getAllLogin();

	EmpLogin findUser(String username, String password);

}
