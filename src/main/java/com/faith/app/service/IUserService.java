package com.faith.app.service;

import java.util.List;
import java.util.Optional;

import com.faith.app.entity.EmpUser;



public interface IUserService {
	
	
	// get all users
	List<EmpUser> getAllUsers();

	// get user by id
	Optional<EmpUser> getUserById(Integer id);

	// add users
	void addUser(EmpUser user);

	// update user
	void updateUser(EmpUser user);

	// disable
	void disableUser(Integer id);

	// enable
	void enableUser(Integer id);

	EmpUser findUser(String username, String password);


}
