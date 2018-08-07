package com.project.fms.model;

import java.util.List;

public class Subject {
	private Long id;
	private String codeSubject;
	private String teacher;
	private String name;
	private List<RoomDetail> roomdetails;

	public Subject() {

	}

	public Subject(String codeSubject, String teacher, String name, List<RoomDetail> roomdetails) {
		this.codeSubject = codeSubject;
		this.teacher = teacher;
		this.name = name;
		this.roomdetails = roomdetails;
	}

	public Long getId() {
		return id;
	}

	private void setId(Long id) {
		this.id = id;
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

	public List<RoomDetail> getRoomdetails() {
		return roomdetails;
	}

	public void setRoomdetails(List<RoomDetail> roomdetails) {
		this.roomdetails = roomdetails;
	}

	@Override
	public String toString() {
		return "Subject [codeSubject=" + codeSubject + ", teacher=" + teacher + ", name=" + name + ", roomdetails="
				+ roomdetails + "]";
	}

}
