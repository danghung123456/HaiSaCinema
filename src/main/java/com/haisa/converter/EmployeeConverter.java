package com.haisa.converter;

import org.springframework.stereotype.Component;

import com.haisa.DTO.EmployeeDTO;
import com.haisa.Entity.Employee;


@Component
public class EmployeeConverter {
	public Employee toEntity(EmployeeDTO dto) {
		Employee entity = new Employee();
		entity.setEmployeeId(dto.getEmployeeId());
		entity.setEmail(dto.getEmail());
		entity.setPassword(dto.getPassword());
		entity.setAddress(dto.getAddress());
		entity.setBirthday(dto.getBirthday());
		entity.setCinemaId(dto.getCinemaId());
		entity.setIdCard(dto.getIdCard());
		entity.setName(dto.getName());
		entity.setPhone(dto.getPhone());
		entity.setRole(dto.getRole());
		entity.setStatus(dto.getStatus());
		return entity;
	}
	
	public EmployeeDTO toDTO(Employee entity) {
		EmployeeDTO dto = new EmployeeDTO();
		dto.setEmployeeId(entity.getEmployeeId());
		dto.setEmail(entity.getEmail());
		dto.setPassword(entity.getPassword());
		dto.setAddress(entity.getAddress());
		dto.setBirthday(entity.getBirthday());
		dto.setCinemaId(entity.getCinemaId());
		dto.setIdCard(entity.getIdCard());
		dto.setName(entity.getName());
		dto.setPhone(entity.getPhone());
		dto.setRole(entity.getRole());
		dto.setStatus(entity.getStatus());
		return dto;
	}
	
	public Employee toEntity(EmployeeDTO dto, Employee entity) {
		entity.setEmployeeId(dto.getEmployeeId());
		entity.setEmail(dto.getEmail());
		entity.setPassword(dto.getPassword());
		entity.setAddress(dto.getAddress());
		entity.setBirthday(dto.getBirthday());
		entity.setCinemaId(dto.getCinemaId());
		entity.setIdCard(dto.getIdCard());
		entity.setName(dto.getName());
		entity.setPhone(dto.getPhone());
		entity.setRole(dto.getRole());
		entity.setStatus(dto.getStatus());
		return entity;
	}
}
