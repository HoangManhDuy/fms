package com.project.fms.service.impl;

import java.util.List;

import com.project.fms.dao.RoomDAO;
import com.project.fms.model.Room;
import com.project.fms.service.RoomService;

public class RoomServiceImpl implements RoomService {
	protected RoomDAO roomDAO;

	public RoomDAO getRoomDAO() {
		return roomDAO;
	}

	public void setRoomDAO(RoomDAO roomDAO) {
		this.roomDAO = roomDAO;
	}

	@Override
	public List<Room> loadRooms() {
		return roomDAO.loadRooms();
	}

}
