package com.faith.app.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "project")
public class Project {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int project_id;

	private String project_name;

	// one project 
	@OneToMany(mappedBy = "project")
	private List<FormDetails> details;

	public Project() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Project(int project_id, String project_name, List<FormDetails> details) {
		super();
		this.project_id = project_id;
		this.project_name = project_name;
		this.details = details;
	}

	//getters and setters
	public int getProject_id() {
		return project_id;
	}

	public void setProject_id(int project_id) {
		this.project_id = project_id;
	}

	public String getProject_name() {
		return project_name;
	}

	public void setProject_name(String project_name) {
		this.project_name = project_name;
	}

	


	
	

}
