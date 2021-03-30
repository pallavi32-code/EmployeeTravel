package com.faith.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.faith.app.entity.EmpUser;
import com.faith.app.entity.FormDetails;
import com.faith.app.repo.FormDetailsRepository;

public class Form implements IForm {
	
	@Autowired
	private FormDetailsRepository formDetails;

	@Override
	public List<FormDetails> getAllForms() {
		
		return null;
	}

	@Override
	public Optional<FormDetails> getFormById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addForm(FormDetails form) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateForm(FormDetails form) {
		// TODO Auto-generated method stub

	}

}
