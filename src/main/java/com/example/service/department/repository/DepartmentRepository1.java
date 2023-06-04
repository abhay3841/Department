/**
 * 
 */
package com.example.service.department.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.service.department.model.Department;

/**
 * @author Admin
 *
 */
@Repository
public interface DepartmentRepository1 extends MongoRepository<Department, String> {

	@Query("{ 'departmentName' : ?0 }")
	Department findDepartmentByDepartmentName(String name);
}
