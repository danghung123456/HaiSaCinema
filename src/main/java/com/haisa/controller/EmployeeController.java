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
import com.haisa.DTO.EmployeeDTO;
import com.haisa.Entity.Employee;
import com.haisa.service.impl.EmployeeService;



@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;

	@GetMapping("/employee")
	public List<EmployeeDTO> getAllEmployee() {
		return employeeService.findAll();
	}

	@GetMapping("/employee/{employeeId}")
	public EmployeeDTO getEmployeeById(@PathVariable(value = "employeeId") Integer employeeId){
		 Employee emp = new Employee();
		 emp.setEmployeeId(employeeId);
		return employeeService.findEmployee(emp);
	}

	@PostMapping("/employee")
	public EmployeeDTO createEmployee(@RequestBody EmployeeDTO employee) {
		return employeeService.save(employee);
	}

	@PutMapping("/employee/{employeeId}")
	public EmployeeDTO updateEmployee(@RequestBody EmployeeDTO employee, @PathVariable("employeeId") Integer employeeId) {
		employee.setEmployeeId(employeeId);
		return employeeService.update(employee);
	}
	@DeleteMapping("/employee")
	public void deleteEmployeeById(@RequestBody Integer[] ids) {
		employeeService.delete(ids);
		
	}
}
