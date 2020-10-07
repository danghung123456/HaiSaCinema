package com.haisa.converter;

import org.springframework.stereotype.Component;

import com.haisa.DTO.MovieDTO;
import com.haisa.Entity.Movie;


@Component
public class MovieConverter {
	public Movie toEntity(MovieDTO dto) {
		Movie entity = new Movie();
		entity.setMovieId(dto.getMovieId());
		entity.setMovieName(dto.getMovieName());
		entity.setDescription(dto.getDescription());
		entity.setThumbnail(dto.getThumbnail());
		entity.setDuration(dto.getDuration());
		entity.setActors(dto.getActors());
		entity.setDirector(dto.getDirector());
		entity.setAgeLimit(dto.getAgeLimit());
		entity.setStatus(dto.getStatus());
		
		return entity;
	}
	
	public MovieDTO toDTO(Movie entity) {
		MovieDTO dto = new MovieDTO();
		dto.setMovieId(entity.getMovieId());
		dto.setMovieName(entity.getMovieName());
		dto.setDescription(entity.getDescription());
		dto.setThumbnail(entity.getThumbnail());
		dto.setDuration(entity.getDuration());
		dto.setActors(entity.getActors());
		dto.setDirector(entity.getDirector());
		dto.setAgeLimit(entity.getAgeLimit());
		dto.setStatus(entity.getStatus());
		return dto;
	}
	
	public Movie toEntity(MovieDTO dto, Movie entity) {
		entity.setMovieId(dto.getMovieId());
		entity.setMovieName(dto.getMovieName());
		entity.setDescription(dto.getDescription());
		entity.setThumbnail(dto.getThumbnail());
		entity.setDuration(dto.getDuration());
		entity.setActors(dto.getActors());
		entity.setDirector(dto.getDirector());
		entity.setAgeLimit(dto.getAgeLimit());
		entity.setStatus(dto.getStatus());
		return entity;
	}
}
