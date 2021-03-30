package com.faith.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.faith.app.entity.EmpLogin;
import com.faith.app.repo.LoginRepository;

@Service
public class LoginService implements ILoginService {
	
	@Autowired
	private LoginRepository loginRepository;

	@Override
	public List<EmpLogin> getAllLogin() {
		
		return (List<EmpLogin>) loginRepository.findAll();
	}

	@Override
	public EmpLogin findUser(String username, String password) {
		
		return loginRepository.findByUsernameAndPassword(username, password);
	}

}
