package com.project.fms.model;

import java.util.Date;

public class Repuested {
	private Long id;
	private Account account;
	private String name;
	private String family_register;
	private Date date_of_birth;
	private int gender;
	private String avatar;
	private String type_of_training;
	private String phone;

	public Repuested() {

	}

	public Repuested(Account account, String name, String family_register, Date date_of_birth, int gender,
			String avatar, String type_of_training, String phone) {
		this.account = account;
		this.name = name;
		this.family_register = family_register;
		this.date_of_birth = date_of_birth;
		this.gender = gender;
		this.avatar = avatar;
		this.type_of_training = type_of_training;
		this.phone = phone;
	}

	public Long getId() {
		return id;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFamily_register() {
		return family_register;
	}

	public void setFamily_register(String family_register) {
		this.family_register = family_register;
	}

	public Date getDate_of_birth() {
		return date_of_birth;
	}

	public void setDate_of_birth(Date date_of_birth) {
		this.date_of_birth = date_of_birth;
	}

	public int getGender() {
		return gender;
	}

	public void setGender(int gender) {
		this.gender = gender;
	}

	public String getAvatar() {
		return avatar;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	public String getType_of_training() {
		return type_of_training;
	}

	public void setType_of_training(String type_of_training) {
		this.type_of_training = type_of_training;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Repuested [account=" + account + ", name=" + name + ", family_register=" + family_register
				+ ", date_of_birth=" + date_of_birth + ", gender=" + gender + ", avatar=" + avatar
				+ ", type_of_training=" + type_of_training + ", phone=" + phone + "]";
	}

}
