package com.haisa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.haisa.entity.Room;

@Repository
public interface RoomRepository extends JpaRepository<Room, Integer> {
	Room findByRoomId(Integer roomId);
}
