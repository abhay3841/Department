/**
 * 
 */
package com.example.service.department.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.service.department.model.Department;
import com.example.service.department.repository.DepartmentRepository1;
import com.example.service.department.service.DepartmentService;

/**
 * @author Admin
 *
 */
@Service
public class DepartmentImpl implements DepartmentService{
	
	@Autowired
	DepartmentRepository1 departmentRepository1;

	@Override
	public Department getById(String id) {
		// TODO Auto-generated method stub
		return departmentRepository1.findById(id).get();
		
	}

	@Override
	public void addDepartment(Department department) {
		// TODO Auto-generated method stub
		departmentRepository1.save(department);
	}
	
	@Override
	public Department getByName(String name) {
		// TODO Auto-generated method stub
		return departmentRepository1.findDepartmentByDepartmentName(name);
	}

}
