package com.haisa.service.impl;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.haisa.DTO.EmployeeDTO;
import com.haisa.Entity.Employee;
import com.haisa.converter.EmployeeConverter;
import com.haisa.repository.EmployeeRepository;
import com.haisa.service.EmployeeSv;

@Service
public class EmployeeService implements EmployeeSv {
	@Autowired
	private EmployeeRepository employeeRepository;

	@Autowired
	private EmployeeConverter employeeConverter;

	@Override
	public EmployeeDTO save(EmployeeDTO employeeDTO) {
		Employee empl = employeeConverter.toEntity(employeeDTO);
		empl = employeeRepository.save(empl);
		return employeeConverter.toDTO(empl);
	}

	@Override
	public EmployeeDTO update(EmployeeDTO employeeDTO) {
		Employee oldEmpl = employeeRepository.findByEmployeeId(employeeDTO.getEmployeeId());
		Employee empl = employeeConverter.toEntity(employeeDTO, oldEmpl);
		empl = employeeRepository.save(empl);
		return employeeConverter.toDTO(empl);
	}

	@Override
	public void delete(Integer[] ids) {
		for (Integer item : ids) {
			employeeRepository.deleteById(item);
		}
	}

	@Override
	public List<EmployeeDTO> findAll() {
		List<EmployeeDTO> listEmployeeDTO = new ArrayList<EmployeeDTO>();
		List<Employee> entity = employeeRepository.findAll();
		for (Employee item : entity) {
			EmployeeDTO employeeDTO = employeeConverter.toDTO(item);
			listEmployeeDTO.add(employeeDTO);
		}
		return listEmployeeDTO;
	}

	@Override
	public EmployeeDTO findEmployee(Employee entity) {
		EmployeeDTO employeedto;
		entity = employeeRepository.findByEmployeeId(entity.getEmployeeId());
		employeedto = employeeConverter.toDTO(entity);
		return employeedto;
	}

}
