/**
 * 
 */
package com.example.service.department.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Admin
 *
 */
@Document
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Department {

	@Id
	private String id;
	private String departmentName;
	
}
