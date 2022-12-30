package com.devsuperior.bds01;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.bds01.dto.DepartmentDTO;
import com.devsuperior.bds01.entities.Department;
import com.devsuperior.bds01.repositories.DepartmentRepository;

@Service
public class DepartmentService {

	@Autowired
	private DepartmentRepository repository;
	
	@Transactional
	public List<DepartmentDTO> findAll() {
		List<Department> departments = repository.findAll();
		List<DepartmentDTO> list = new ArrayList<>();
		departments.forEach(dep -> list.add(new DepartmentDTO(dep)));
		return list;
	}
}
