package com.haisa.converter;

import org.springframework.stereotype.Component;

import com.haisa.DTO.CinemaDTO;
import com.haisa.entity.Cinema;

@Component
public class CinemaConverter {

	public Cinema toEntity(CinemaDTO dto) {
		Cinema entity = new Cinema();
		entity.setCinemaId(dto.getCinemaId());
		entity.setName(dto.getName());
		entity.setName(dto.getName());
		
		return entity;
		
		
	}
	
	public CinemaDTO toDTO(Cinema entity) {
		CinemaDTO dto = new CinemaDTO();
		dto.setCinemaId(entity.getCinemaId());
		dto.setName(entity.getName());
		dto.setAddress(entity.getAddress());
		return dto;
		
		
	}
	
	public Cinema toEntity(CinemaDTO dto, Cinema entity) {
		
		entity.setCinemaId(dto.getCinemaId());
		entity.setName(dto.getName());
		entity.setName(dto.getName());
		
		return entity;
		
		
	}
}