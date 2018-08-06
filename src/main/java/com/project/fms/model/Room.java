package com.project.fms.model;

import java.util.List;

public class Room {
	private Long id;
	private String name;
	private String codeClass;
	private List<Account> accounts;
	private List<RoomDetail> roomdetails;

	public Room() {

	}

	public Room(String name, String codeClass, List<Account> accounts, List<RoomDetail> roomdetails) {
		this.name = name;
		this.codeClass = codeClass;
		this.accounts = accounts;
		this.roomdetails = roomdetails;
	}

	public Long getId() {
		return id;
	}

	private void setId(Long id) {
		this.id = id;
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

	public List<Account> getAccounts() {
		return accounts;
	}

	public void setAccounts(List<Account> accounts) {
		this.accounts = accounts;
	}

	public List<RoomDetail> getRoomdetails() {
		return roomdetails;
	}

	public void setRoomdetails(List<RoomDetail> roomdetails) {
		this.roomdetails = roomdetails;
	}

	@Override
	public String toString() {
		return "Room [name=" + name + ", codeClass=" + codeClass + ", accounts=" + accounts + ", roomdetails="
				+ roomdetails + "]";
	}

}
