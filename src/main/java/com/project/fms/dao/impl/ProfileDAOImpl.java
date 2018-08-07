package com.project.fms.dao.impl;

import java.io.Serializable;
import java.util.List;

import com.project.fms.dao.GenericDAO;
import com.project.fms.dao.ProfileDAO;
import com.project.fms.model.Profile;

public class ProfileDAOImpl extends GenericDAO<Integer, Profile> implements ProfileDAO {

	@Override
	public Profile saveOrUpdate(Profile entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Profile findById(Serializable key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Profile findByMssv(String mssv) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Profile> searchProfileUsingCretial(String mssv) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Profile> loadProfiles() {
		// TODO Auto-generated method stub
		return null;
	}

}
