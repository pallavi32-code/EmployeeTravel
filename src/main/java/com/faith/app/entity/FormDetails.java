package com.faith.app.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "form")
public class FormDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int form_id;
	private String cause_travel;
	private String source;
	private String destination;

	private int user_id;
	private int project_id;

	// may login one role
	@ManyToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name = "project_id", updatable = false, insertable = false)
	private Project project;

	// may login one role
	@ManyToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name = "user_id", updatable = false, insertable = false)
	private EmpUser user;

	public FormDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	public FormDetails(int form_id, String cause_travel, int user_id, int project_id, Project project, EmpUser user
			,String source,String destination) {
		super();
		this.form_id = form_id;
		this.cause_travel = cause_travel;
		this.user_id = user_id;
		this.project_id = project_id;
		this.project = project;
		this.user = user;
		this.destination=destination;
		this.source=source;
	}

	public int getForm_id() {
		return form_id;
	}

	public void setForm_id(int form_id) {
		this.form_id = form_id;
	}

	public String getCause_travel() {
		return cause_travel;
	}

	public void setCause_travel(String cause_travel) {
		this.cause_travel = cause_travel;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}
	
	
	

}
