package com.project.fms.service;

import java.util.List;

import com.project.fms.model.Profile;

public interface ProfileService extends BaseService<Integer, Profile>{
	boolean deleteProfile(Integer id);

	Profile findByMssv(String mssv);

	List<Profile> searchProfiles(String mssv);

	List<Profile> loadProfiles();
}
