package com.devsuperior.bds01.dto;

import java.util.List;

import com.devsuperior.bds01.entities.Department;
import com.devsuperior.bds01.entities.Employee;

public class DepartmentDTO {
	
	private Long id;
	private String name;
	private List<EmployeeDTO> employes;
	
	public DepartmentDTO() {
		
	}

	public DepartmentDTO(Long id, String name, List<EmployeeDTO> employes) {
		super();
		this.id = id;
		this.name = name;
		this.employes = employes;
	}
	
	public DepartmentDTO(Department entity) {
		this.id = entity.getId();
		this.name = entity.getName();
	}
	
	public DepartmentDTO(Department entity, List<Employee> employes) {
		this(entity);
		employes.forEach(emp -> this.employes.add(new EmployeeDTO(emp)));
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<EmployeeDTO> getEmployes() {
		return employes;
	}	
}
