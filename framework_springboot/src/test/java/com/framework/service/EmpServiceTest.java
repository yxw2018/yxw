package com.framework.service;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.framework.entity.Emp;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EmpServiceTest {
	
	@Autowired
	private EmpService empService;
	
	@Test
	public void getById() {
		Emp emp = empService.getById(1l);
		System.out.println(emp);
	}
	
	@Test
	public void list() {
		List<Emp> emp = empService.list();
		System.out.println(emp);
	}
	
}
