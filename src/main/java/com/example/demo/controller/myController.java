package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Employee;
import com.example.demo.service.EmpService;

@RestController
public class myController {
	
	@Autowired
	
	EmpService empS;
	
	@GetMapping("/home")
	public String home() {
		
		return "home";
	}
	
	
	@GetMapping("/home/getAll")
	public List<Employee>  getAll() {
		
	  return empS.empAll();
		
	}
	
	@PostMapping("/home/add")
	 public Employee addUser(@RequestBody Employee emp ) {
		
		return empS.add(emp);		
		
	}
	
	@PutMapping("/home/update")
	public Employee updateemp(@RequestBody Employee emp) {
		
		return empS.update(emp);
	}
	
	@DeleteMapping("/home/delete/{empid}")
	public String deleteId(@PathVariable int empid) {
		
		return empS.delete(empid);
	}

}
