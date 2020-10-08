package com.haisa.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.haisa.DTO.CinemaDTO;

import com.haisa.converter.CinemaConverter;
//import com.haisa.entity.Cinema;
import com.haisa.entity.Cinema;
import com.haisa.repository.CinemaRepository;
import com.haisa.service.CinemaSv;

@Service
public class CinemaService implements CinemaSv {

	@Autowired
	private CinemaRepository cinemaRepository;
	
	@Autowired
	private CinemaConverter cinemaConverter;
		
	@Override
	public CinemaDTO save(CinemaDTO cinemaDTO) {
		Cinema cinema= cinemaConverter.toEntity(cinemaDTO);
		cinema = cinemaRepository.save(cinema);
		return cinemaConverter.toDTO(cinema);
	}

	@Override
	public CinemaDTO update(CinemaDTO cinemaDTO) {
		Cinema oldCinema = cinemaRepository.findByCinemaId(cinemaDTO.getCinemaId());
		Cinema cinema = cinemaConverter.toEntity(cinemaDTO, oldCinema);
		cinema = cinemaRepository.save(cinema);
		return cinemaConverter.toDTO(cinema);
	}

	@Override
	public List<CinemaDTO> findAll() {
		List<CinemaDTO> task = new ArrayList<CinemaDTO>();
		List<Cinema> entity = cinemaRepository.findAll();
		for (Cinema item : entity) {
			CinemaDTO tasks = cinemaConverter.toDTO(item);
			task.add(tasks);
		}
		return task;
	}



	@Override
	public void delete(Integer[] ids) {
		for(Integer item: ids) {
			cinemaRepository.deleteById(item);
		}
		
	}

	@Override
	public CinemaDTO findCinema(com.haisa.service.Cinema cinema) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CinemaDTO findCinema(com.haisa.service.Cinema cinema) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CinemaDTO findCinema(com.haisa.service.Cinema cinema) {
		// TODO Auto-generated method stub
		return null;
	}

}
