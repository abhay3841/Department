/**
 * 
 */
package com.example.service.department.service;

import com.example.service.department.model.Department;

/**
 * @author Admin
 *
 */
public interface DepartmentService {
	
	public Department getById(String id);
	
	public void addDepartment(Department department);

	public Department getByName(String name);
}
