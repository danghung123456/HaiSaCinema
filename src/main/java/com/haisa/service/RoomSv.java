package com.haisa.service;

import java.util.List;

import com.haisa.DTO.RoomDTO;
import com.haisa.Entity.Room;
;

public interface RoomSv {
	RoomDTO save(RoomDTO roomDTO);
	RoomDTO update(RoomDTO roomDTO);
	List<RoomDTO> findAll();
	RoomDTO findRoom(Room room);
	void delete(Integer[] ids);
}
