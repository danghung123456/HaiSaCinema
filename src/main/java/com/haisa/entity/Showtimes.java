package com.haisa.entity;
// Generated Oct 6, 2020, 8:38:42 AM by Hibernate Tools 5.1.10.Final

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Showtimes generated by hbm2java
 */
@Entity
@Table(name = "Showtimes", schema = "dbo", catalog = "MovieManagement")
public class Showtimes  {

	private Integer showtimeId;
	private int movieId;
	private int roomId;
	private Date date;
	private Integer period;
	private Integer employeeId;
	private Integer cinemaId;
	private Integer status;

	public Showtimes() {
	}

	public Showtimes(int movieId, int roomId) {
		this.movieId = movieId;
		this.roomId = roomId;
	}

	public Showtimes(int movieId, int roomId, Date date, Integer period, Integer employeeId, Integer cinemaId,
			Integer status) {
		this.movieId = movieId;
		this.roomId = roomId;
		this.date = date;
		this.period = period;
		this.employeeId = employeeId;
		this.cinemaId = cinemaId;
		this.status = status;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "showtimeId", unique = true, nullable = false)
	public Integer getShowtimeId() {
		return this.showtimeId;
	}

	public void setShowtimeId(Integer showtimeId) {
		this.showtimeId = showtimeId;
	}

	@Column(name = "movieId", nullable = false)
	public int getMovieId() {
		return this.movieId;
	}

	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}

	@Column(name = "roomId", nullable = false)
	public int getRoomId() {
		return this.roomId;
	}

	public void setRoomId(int roomId) {
		this.roomId = roomId;
	}

	@Column(name = "date")
	public Serializable getDate() {
		return this.date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Column(name = "period")
	public Integer getPeriod() {
		return this.period;
	}

	public void setPeriod(Integer period) {
		this.period = period;
	}

	@Column(name = "employeeId")
	public Integer getEmployeeId() {
		return this.employeeId;
	}

	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}

	@Column(name = "cinemaId")
	public Integer getCinemaId() {
		return this.cinemaId;
	}

	public void setCinemaId(Integer cinemaId) {
		this.cinemaId = cinemaId;
	}

	@Column(name = "status")
	public Integer getStatus() {
		return this.status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

}
