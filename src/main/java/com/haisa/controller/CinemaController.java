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

import com.haisa.DTO.CinemaDTO;
import com.haisa.entity.Cinema;
import com.haisa.service.impl.CinemaService;

@RestController
public class CinemaController {

	@Autowired
	CinemaService cinemaService;
	

	@GetMapping("/cinema")
	public List<CinemaDTO> getAllCinema() {
		return cinemaService.findAll();
	}

	@GetMapping("/cinema/{cinemaId}")
	public CinemaDTO getCinemaById(@PathVariable(value = "cinemaId") Integer cinemaId){
		 Cinema cinema = new Cinema();
		 cinema.setCinemaId(cinemaId);
		return cinemaService.findCinema(cinema);
	}

	@PostMapping("/cinema")
	public CinemaDTO createCinema(@RequestBody CinemaDTO cinema) {
		return cinemaService.save(cinema);
	}

	@PutMapping("/cinema/{cinemaId}")
	public CinemaDTO updateCinema(@RequestBody CinemaDTO cinema, @PathVariable("cinemaId") Integer cinemaId) {
		cinema.setCinemaId(cinemaId);
		return cinemaService.update(cinema);
	}
	@DeleteMapping("/cinema")
	public void deleteCinemaById(@RequestBody Integer[] ids) {
		cinemaService.delete(ids);
		
	}
}
