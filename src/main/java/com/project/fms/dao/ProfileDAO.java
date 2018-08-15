package com.project.fms.dao;

import java.util.List;

import com.project.fms.model.Profile;

public interface ProfileDAO extends BaseDAO<Integer, Profile>{
	Profile findByMssv(String mssv);
	
	List<Profile> searchProfileUsingCretial(String mssv);

	List<Profile> loadProfiles();
}
