/**
 * 
 */
package com.example.service.department.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.service.department.model.Department;
import com.example.service.department.service.impl.DepartmentImpl;

/**
 * @author Admin
 *
 */

@RestController
public class DepartmentController {
	@Autowired
	private DepartmentImpl deptServiceImpl;
	
	@PostMapping("/api/department/save")
	ResponseEntity<Object> addDepartment(@RequestBody Department dept){
		deptServiceImpl.addDepartment(dept);
		return new ResponseEntity<>(HttpStatus.OK);
	}
//	@GetMapping("/api/department/{id}")
//	ResponseEntity<Department> getDepartmentById(String id){
//		return new ResponseEntity<>(deptServiceImpl.getById(id),HttpStatus.OK);		
//	}
	@GetMapping("/api/department/{name}")
	ResponseEntity<Department> getDepartmentByName(@PathVariable String name){
		return new ResponseEntity<>(deptServiceImpl.getByName(name),HttpStatus.OK);		
	}
	

}
