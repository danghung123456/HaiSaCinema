package com.haisa.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.haisa.entity.Employee;
@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer>{

	Employee findByEmployeeId(Integer memberId);
	}



