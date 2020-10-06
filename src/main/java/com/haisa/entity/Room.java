package com.haisa.entity;
// Generated Oct 6, 2020, 8:38:42 AM by Hibernate Tools 5.1.10.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Room generated by hbm2java
 */
@Entity
@Table(name = "Room", schema = "dbo", catalog = "MovieManagement")
public class Room implements java.io.Serializable {

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

	@Column(name = "roomID", unique = true, nullable = false)
	public Integer getRoomId() {
		return this.roomId;
	}

	public void setRoomId(Integer roomId) {
		this.roomId = roomId;
	}

	@Column(name = "roomName")
	public Integer getRoomName() {
		return this.roomName;
	}

	public void setRoomName(Integer roomName) {
		this.roomName = roomName;
	}

	@Column(name = "seatAmount")
	public Integer getSeatAmount() {
		return this.seatAmount;
	}

	public void setSeatAmount(Integer seatAmount) {
		this.seatAmount = seatAmount;
	}

	@Column(name = "cinemaId")
	public Integer getCinemaId() {
		return this.cinemaId;
	}

	public void setCinemaId(Integer cinemaId) {
		this.cinemaId = cinemaId;
	}

}
