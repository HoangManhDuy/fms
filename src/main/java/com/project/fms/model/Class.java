package com.project.fms.model;

public class Class {
	private Long id;
	private String name;
	private String codeClass;

	public Class() {

	}

	public Class(String name, String codeClass) {
		this.name = name;
		this.codeClass = codeClass;
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCodeClass() {
		return codeClass;
	}

	public void setCodeClass(String codeClass) {
		this.codeClass = codeClass;
	}

	@Override
	public String toString() {
		return "Class [name=" + name + ", classCode=" + codeClass + "]";
	}

}
