package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.demo.dao.empRepo;
import com.example.demo.entity.Employee;

@Service
public class EmpService {
	
	@Autowired
	empRepo repo;

	public List<Employee> empAll() {
		// TODO Auto-generated method stub
		
		return repo.findAll();
		
	}
	
	public Employee add(Employee emp) {
		return repo.save(emp);
		
	}
	
	
	public Employee update(Employee emp) {
		
		Employee newuser;
		Optional<Employee> updated = repo.findById(emp.getEmpid());
		if(updated.isPresent()) {
			 newuser =updated.get();
			
			newuser.setManager(emp.getManager());
			newuser.setProjectid(emp.getProjectid());
		}
		else {
		return null;		
	     }
		
		return newuser;
	}

	public String delete(int empid) {
		
		repo.deleteById(empid);		
		return "user got deleted";
		
	}
	

}
