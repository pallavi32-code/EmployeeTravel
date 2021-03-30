package com.faith.app.service;

import java.util.List;
import java.util.Optional;

import com.faith.app.entity.EmpUser;
import com.faith.app.entity.FormDetails;

public interface IForm {
	
		// get all users
		List<FormDetails> getAllForms();

		// get user by id
		Optional<FormDetails> getFormById(Integer id);

		// add users
		void addForm(FormDetails form);

		// update user
		void updateForm(FormDetails form);


}
