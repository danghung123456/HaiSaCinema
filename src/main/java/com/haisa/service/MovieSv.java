package com.haisa.service;

import java.util.List;

import com.haisa.DTO.MovieDTO;
import com.haisa.entity.Movie;


public interface MovieSv {
	MovieDTO save(MovieDTO movieDTO);
	MovieDTO update(MovieDTO movieDTO);
	List<MovieDTO> findAll();
	MovieDTO findMovie(Movie movie);
	void delete(Integer[] ids);
}
