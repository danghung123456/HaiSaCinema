package com.haisa.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.haisa.DTO.CinemaDTO;
import com.haisa.DTO.RoomDTO;
import com.haisa.Entity.Cinema;
import com.haisa.Entity.Room;
import com.haisa.converter.RoomConverter;
import com.haisa.repository.RoomRepository;
import com.haisa.service.RoomSv;

@Service
public class RoomService implements RoomSv {

	@Autowired
	private RoomRepository roomRepository;
	
	@Autowired
	private RoomConverter roomConverter;
	
	@Override
	public RoomDTO save(RoomDTO roomDTO) {
		Room room= roomConverter.toEntity(roomDTO);
		room = roomRepository.save(room);
		return roomConverter.toDTO(room);
	}

	@Override
	public RoomDTO update(RoomDTO roomDTO) {
		Room oldRoom = roomRepository.findByRoomId(roomDTO.getRoomId());
		Room room = roomConverter.toEntity(roomDTO, oldRoom);
		room = roomRepository.save(room);
		return roomConverter.toDTO(room);
	}

	@Override
	public List<RoomDTO> findAll() {
		List<RoomDTO> task = new ArrayList<RoomDTO>();
		List<Room> entity = roomRepository.findAll();
		for (Room item : entity) {
			RoomDTO tasks = roomConverter.toDTO(item);
			task.add(tasks);
		}
		return task;
	}

	@Override
	public RoomDTO findRoom(Room entity) {
		RoomDTO roomdto ;
		entity = roomRepository.findByRoomId(entity.getRoomId());
		roomdto = roomConverter.toDTO(entity);
		return roomdto;
	}

	@Override
	public void delete(Integer[] ids) {
		for(Integer item: ids) {
			roomRepository.deleteById(item);
		}
		
	}

}
