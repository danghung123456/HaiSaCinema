package com.haisa.service;

import java.util.List;



import com.haisa.DTO.CinemaDTO;
import com.haisa.Entity.Cinema;


public interface CinemaSv {

	CinemaDTO save(CinemaDTO cinemaDTO);
	CinemaDTO update(CinemaDTO cinemaDTO);
	List<CinemaDTO> findAll();
	CinemaDTO findCinema(Cinema cinema);
	void delete(Integer[] ids);
	
}
