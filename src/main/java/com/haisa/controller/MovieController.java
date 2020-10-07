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
import com.haisa.DTO.MovieDTO;
import com.haisa.Entity.Movie;
import com.haisa.service.impl.MovieService;


@RestController
public class MovieController {
	
	@Autowired
	private MovieService movieService;

	@GetMapping("/movie")
	public List<MovieDTO> getAllMovie() {
		return movieService.findAll();
	}

	@GetMapping("/movie/{movieId}")
	public MovieDTO getMovieById(@PathVariable(value = "movieId") Integer movieId){
		 Movie movie = new Movie();
		 movie.setMovieId(movieId);;
		return movieService.findMovie(movie);
	}

	@PostMapping("/movie")
	public MovieDTO createMovie(@RequestBody MovieDTO movie) {
		return movieService.save(movie);
	}

	@PutMapping("/movie/{movieId}")
	public MovieDTO updateMovie(@RequestBody MovieDTO movie, @PathVariable("movieId") Integer movieId) {
		movie.setMovieId(movieId);
		return movieService.update(movie);
	}
	@DeleteMapping("/movie")
	public void deleteMovieById(@RequestBody Integer[] ids) {
		movieService.delete(ids);
		
	}
}
