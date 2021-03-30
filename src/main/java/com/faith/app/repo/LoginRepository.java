package com.faith.app.repo;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.faith.app.entity.EmpLogin;
import com.faith.app.entity.EmpUser;

public interface LoginRepository extends CrudRepository<EmpLogin, Integer> {
	
	@Query("from EmpLogin where username=?1 and password=?2")
	EmpLogin findByUsernameAndPassword(String username, String password);

}
