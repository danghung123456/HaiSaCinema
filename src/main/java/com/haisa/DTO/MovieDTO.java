package com.haisa.DTO;

import java.io.Serializable;

public class MovieDTO {

	private Integer movieId;
	private String movieName;
	private Integer duration;
	private String description;
	private String thumbnail;
	private String actors;
	private String director;
	private Integer ageLimit;
	private Integer status;
	public Integer getMovieId() {
		return movieId;
	}
	public void setMovieId(Integer movieId) {
		this.movieId = movieId;
	}
	public Serializable getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public Integer getDuration() {
		return duration;
	}
	public void setDuration(Integer duration) {
		this.duration = duration;
	}
	public Serializable getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getThumbnail() {
		return thumbnail;
	}
	public void setThumbnail(String thumbnail) {
		this.thumbnail = thumbnail;
	}
	public Serializable getActors() {
		return actors;
	}
	public void setActors(String actors) {
		this.actors = actors;
	}
	public Serializable getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public Integer getAgeLimit() {
		return ageLimit;
	}
	public void setAgeLimit(Integer ageLimit) {
		this.ageLimit = ageLimit;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}

}
