package com.project.fms.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;

import com.project.fms.dao.GenericDAO;
import com.project.fms.dao.RoomDAO;
import com.project.fms.model.Room;

public class RoomDAOImpl extends GenericDAO<Integer, Room> implements RoomDAO {
	public RoomDAOImpl() {
		super(Room.class);
	}

	public RoomDAOImpl(SessionFactory sessionFactory) {
		setSessionFactory(sessionFactory);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Room> loadRooms() {
		return getSession().createQuery("FROM Room").getResultList();
	}

}
