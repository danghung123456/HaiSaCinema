package com.haisa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.haisa.DTO.RoomDTO;

import com.haisa.Entity.Room;
import com.haisa.service.impl.RoomService;

@RestController
public class RoomController {

	@Autowired
	RoomService roomService;
	
	@GetMapping("/room")
	public List<RoomDTO> getAllRoom() {
		return roomService.findAll();
	}

	@GetMapping("/room/{roomId}")
	public RoomDTO getRoomById(@PathVariable(value = "roomId") Integer roomId){
		 Room room = new Room();
		 room.setRoomId(roomId);
		return roomService.findRoom(room);
	}

	@PostMapping("/room")
	public RoomDTO createRoom(@RequestBody RoomDTO room) {
		return roomService.save(room);
	}

	@PutMapping("/room/{roomId}")
	public RoomDTO updateRoom(@RequestBody RoomDTO room, @PathVariable("roomId") Integer roomId) {
		room.setRoomId(roomId);
		return roomService.update(room);
	}
	@DeleteMapping("/room")
	public void deleteRoomById(@RequestBody Integer[] ids) {
		roomService.delete(ids);
		
	}
}
