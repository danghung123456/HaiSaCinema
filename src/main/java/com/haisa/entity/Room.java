package com.haisa.Entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "room")
public class Room {

	private Integer roomId;
	private Integer roomName;
	private Integer seatAmount;
	private Integer cinemaId;

	public Room() {
	}

	public Room(Integer roomName, Integer seatAmount, Integer cinemaId) {
		this.roomName = roomName;
		this.seatAmount = seatAmount;
		this.cinemaId = cinemaId;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "roomid")
	public Integer getRoomId() {
		return this.roomId;
	}

	public void setRoomId(Integer roomId) {
		this.roomId = roomId;
	}

	@Column(name = "roomname")
	public Integer getRoomName() {
		return this.roomName;
	}

	public void setRoomName(Integer roomName) {
		this.roomName = roomName;
	}

	@Column(name = "seatamount")
	public Integer getSeatAmount() {
		return this.seatAmount;
	}

	public void setSeatAmount(Integer seatAmount) {
		this.seatAmount = seatAmount;
	}

	@Column(name = "cinemaid")
	public Integer getCinemaId() {
		return this.cinemaId;
	}

	public void setCinemaId(Integer cinemaId) {
		this.cinemaId = cinemaId;
	}

}
