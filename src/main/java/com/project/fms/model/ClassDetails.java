package com.project.fms.model;

import java.util.Date;

public class ClassDetails {
	private Long id;
	private Class classes;
	private Subject subject;
	private Date date;
	private String time_start;

	public ClassDetails() {

	}

	public ClassDetails(Class classes, Subject subject, Date date, String time_start) {
		this.classes = classes;
		this.subject = subject;
		this.date = date;
		this.time_start = time_start;
	}

	public Long getId() {
		return id;
	}

	public Class getClasses() {
		return classes;
	}

	public void setClasses(Class classes) {
		this.classes = classes;
	}

	public Subject getSubject() {
		return subject;
	}

	public void setSubject(Subject subject) {
		this.subject = subject;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getTime_start() {
		return time_start;
	}

	public void setTime_start(String time_start) {
		this.time_start = time_start;
	}

	@Override
	public String toString() {
		return "ClassDetails [classes=" + classes + ", subject=" + subject + ", date=" + date + ", time_start="
				+ time_start + "]";
	}

}
