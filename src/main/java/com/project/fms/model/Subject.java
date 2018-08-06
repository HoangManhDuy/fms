package com.project.fms.model;

public class Subject {
	private Long id;
	private String codeSubject;
	private String teacher;
	private String name;

	public Subject() {

	}

	public Subject(String codeSubject, String teacher, String name) {
		this.codeSubject = codeSubject;
		this.teacher = teacher;
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public String getCodeSubject() {
		return codeSubject;
	}

	public void setCodeSubject(String codeSubject) {
		this.codeSubject = codeSubject;
	}

	public String getTeacher() {
		return teacher;
	}

	public void setTeacher(String teacher) {
		this.teacher = teacher;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Subject [subjectCode=" + codeSubject + ", teacher=" + teacher + ", name=" + name + "]";
	}

}
