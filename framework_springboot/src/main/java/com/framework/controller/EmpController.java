package com.framework.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.framework.entity.Emp;
import com.framework.service.EmpService;

@RestController
public class EmpController {

	Logger logger = LoggerFactory.getLogger(EmpController.class);
	
	@Autowired
	private EmpService empService;
	
	@ResponseBody
	@RequestMapping("/emp/getById")
	public Emp getById(Long empId) {
		logger.info("执行查询详情");
		return empService.getById(empId);
	}
	
	@ResponseBody
	@RequestMapping("/emp/list")
	public List<Emp> list() {
		logger.info("执行查询列表");
		return empService.list();
	}
	
}
