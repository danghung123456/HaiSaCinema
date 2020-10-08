package com.haisa.service;

import java.util.List;

import com.haisa.DTO.EmployeeDTO;
import com.haisa.entity.Employee;



public interface EmployeeSv {
	EmployeeDTO save(EmployeeDTO employeeDTO);
	EmployeeDTO update(EmployeeDTO employeeDTO);
	List<EmployeeDTO> findAll();
	EmployeeDTO findEmployee(Employee employee);
	void delete(Integer[] ids);
}
