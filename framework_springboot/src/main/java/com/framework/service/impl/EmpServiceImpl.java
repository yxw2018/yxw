package com.framework.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.stereotype.Service;

import com.framework.entity.Emp;
import com.framework.mapper.EmpMapper;
import com.framework.service.EmpService;

@Service
public class EmpServiceImpl implements EmpService {

	@Autowired
	private EmpMapper empMapper;
	
	@Override
	public Emp getById(Long empId) {
		return empMapper.getById(empId);
	}

	@Override
	public List<Emp> list() {
		return empMapper.list();
	}
	
}
