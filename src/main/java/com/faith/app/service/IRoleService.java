package com.faith.app.service;

import java.util.List;

import com.faith.app.entity.EmpRole;

public interface IRoleService {

	// add roles
	void addRole(EmpRole role);

	// view all roles
	List<EmpRole> getAllRoles();

}
