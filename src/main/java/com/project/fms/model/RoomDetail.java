package com.project.fms.model;

import java.util.Date;

public class RoomDetail {
	private Long id;
	private Room room;
	private Subject subject;
	private Date date;
	private String time_start;
	private String time_end;

	public RoomDetail() {

	}

	public RoomDetail(Room room, Subject subject, Date date, String time_start, String time_end) {
		super();
		this.room = room;
		this.subject = subject;
		this.date = date;
		this.time_start = time_start;
		this.time_end = time_end;
	}

	public Long getId() {
		return id;
	}

	private void setId(Long id) {
		this.id = id;
	}

	public Room getRoom() {
		return room;
	}

	public void setRoom(Room room) {
		this.room = room;
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

	public String getTime_end() {
		return time_end;
	}

	public void setTime_end(String time_end) {
		this.time_end = time_end;
	}

	@Override
	public String toString() {
		return "RoomDetail [room=" + room + ", subject=" + subject + ", date=" + date + ", time_start=" + time_start
				+ ", time_end=" + time_end + "]";
	}

}
