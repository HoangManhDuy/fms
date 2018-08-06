package com.project.fms.model;

public class Account {
	private Long id;
	private String email;
	private String password;
	private int role;
	private Profile profile;

	public Account() {

	}

	public Account(String email, String password, int role, Profile profile) {
		this.email = email;
		this.password = password;
		this.role = role;
		this.profile = profile;
	}

	public Long getId() {
		return id;
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

	public Profile getProfile_id() {
		return profile;
	}

	public void setProfile_id(Profile profile) {
		this.profile = profile;
	}

	@Override
	public String toString() {
		return "Account [email=" + email + ", password=" + password + ", role=" + role + ", profile=" + profile + "]";
	}

}
