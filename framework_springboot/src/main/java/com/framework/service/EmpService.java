package com.framework.service;

import java.util.List;

import com.framework.entity.Emp;

public interface EmpService {

	public Emp getById(Long empId);
	
	public List<Emp> list();
	
}
