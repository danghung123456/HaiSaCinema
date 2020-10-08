package com.haisa.converter;

import org.springframework.stereotype.Component;

import com.haisa.DTO.CinemaDTO;
import com.haisa.DTO.RoomDTO;
import com.haisa.entity.Cinema;
import com.haisa.entity.Room;



@Component
public class RoomConverter {

	public Room toEntity(RoomDTO dto) {
		Room entity = new Room();
		entity.setRoomId(dto.getRoomId());
		entity.setRoomName(dto.getRoomName());
		entity.setSeatAmount(dto.getSeatAmount());
		entity.setCinemaId(dto.getCinemaId());
		
		return entity;
		
		
	}
	public RoomDTO toDTO(Room entity) {
		RoomDTO dto = new RoomDTO();
		dto.setRoomId(entity.getRoomId());
		dto.setRoomName(entity.getRoomName());
		dto.setSeatAmount(entity.getSeatAmount());
		dto.setCinemaId(entity.getCinemaId());
		return dto;
		
		
	}
	
	public Room toEntity(RoomDTO dto, Room entity) {
		
		entity.setRoomId(dto.getRoomId());
		entity.setRoomName(dto.getRoomName());
		entity.setSeatAmount(dto.getSeatAmount());
		entity.setCinemaId(dto.getCinemaId());
		
		
		return entity;
		
		
	}
}
