package com.project.fms.model;

import java.util.List;

public class Account {
	private Long id;
	private String email;
	private String password;
	private int role;
	private Profile profile;
	private List<Room> rooms;
	private List<Requested> requesteds;

	public Account() {

	}

	public Account(String email, String password, int role, Profile profile, List<Room> rooms,
			List<Requested> requesteds) {
		this.email = email;
		this.password = password;
		this.role = role;
		this.profile = profile;
		this.rooms = rooms;
		this.requesteds = requesteds;
	}

	public Long getId() {
		return id;
	}

	private void setId(Long id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getRole() {
		return role;
	}

	public void setRole(int role) {
		this.role = role;
	}

	public Profile getProfile() {
		return profile;
	}

	public void setProfile(Profile profile) {
		this.profile = profile;
	}

	public List<Room> getRooms() {
		return rooms;
	}

	public void setRooms(List<Room> rooms) {
		this.rooms = rooms;
	}

	public List<Requested> getRequesteds() {
		return requesteds;
	}

	public void setRequesteds(List<Requested> requesteds) {
		this.requesteds = requesteds;
	}

	@Override
	public String toString() {
		return "Account [email=" + email + ", password=" + password + ", role=" + role + ", profile=" + profile
				+ ", rooms=" + rooms + ", requesteds=" + requesteds + "]";
	}

}
