package com.project.fms.model;

import java.util.Date;

public class Profile {
	private Long id;
	private String name;
	private String family_register;
	private String specialized;
	private Date date_of_birth;
	private int gender;
	private String avatar;
	private String type_of_training;
	private Long academic_year;
	private String mssv;
	private String phone;

	public Profile() {

	}

	public Profile(String name, String family_register, String specialized, Date date_of_birth, int gender,
			String avatar, String type_of_training, Long academic_year, String mssv, String phone) {
		this.name = name;
		this.family_register = family_register;
		this.specialized = specialized;
		this.date_of_birth = date_of_birth;
		this.gender = gender;
		this.avatar = avatar;
		this.type_of_training = type_of_training;
		this.academic_year = academic_year;
		this.mssv = mssv;
		this.phone = phone;
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

	public String getFamily_register() {
		return family_register;
	}

	public void setFamily_register(String family_register) {
		this.family_register = family_register;
	}

	public String getSpecialized() {
		return specialized;
	}

	public void setSpecialized(String specialized) {
		this.specialized = specialized;
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

	public Long getAcademic_year() {
		return academic_year;
	}

	public void setAcademic_year(Long academic_year) {
		this.academic_year = academic_year;
	}

	public String getMssv() {
		return mssv;
	}

	public void setMssv(String mssv) {
		this.mssv = mssv;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Profile [name=" + name + ", family_register=" + family_register + ", specialized=" + specialized
				+ ", date_of_birth=" + date_of_birth + ", gender=" + gender + ", avatar=" + avatar
				+ ", type_of_training=" + type_of_training + ", academic_year=" + academic_year + ", mssv=" + mssv
				+ ", phone=" + phone + "]";
	}

}
