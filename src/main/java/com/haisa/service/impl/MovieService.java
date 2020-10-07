package com.haisa.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.haisa.DTO.MovieDTO;
import com.haisa.entity.Movie;
import com.haisa.converter.MovieConverter;
import com.haisa.repository.MovieRepository;
import com.haisa.service.MovieSv;

@Service
public class MovieService implements MovieSv {
	@Autowired
	private MovieRepository movieRepository;

	@Autowired
	private MovieConverter movieConverter;

	@Override
	public MovieDTO save(MovieDTO movieDTO) {
		Movie movie = movieConverter.toEntity(movieDTO);
		movie = movieRepository.save(movie);
		return movieConverter.toDTO(movie);
	}

	@Override
	public MovieDTO update(MovieDTO movieDTO) {
		Movie oldMovie = movieRepository.findByMovieId(movieDTO.getMovieId());
		Movie movie = movieConverter.toEntity(movieDTO, oldMovie);
		movie = movieRepository.save(movie);
		return movieConverter.toDTO(movie);
	}
	@Override
	public void delete(Integer[] ids) {
		for(Integer item: ids) {
			movieRepository.deleteById(item);
		}
	}
	

	@Override
	public List<MovieDTO> findAll() {
		List<MovieDTO> task = new ArrayList<MovieDTO>();
		List<Movie> entity = movieRepository.findAll();
		for (Movie item : entity) {
			MovieDTO tasks = movieConverter.toDTO(item);
			task.add(tasks);
		}
		return task;
	}

	@Override
	public MovieDTO findMovie(Movie entity) {
		MovieDTO moviedto ;
		entity = movieRepository.findByMovieId(entity.getMovieId());
		moviedto = movieConverter.toDTO(entity);
		return moviedto;
	}

}
