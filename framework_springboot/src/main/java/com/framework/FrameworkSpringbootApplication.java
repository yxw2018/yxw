package com.framework;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@MapperScan(value = "com.framework.mapper")
@SpringBootApplication
@EnableTransactionManagement 
@EnableCaching
public class FrameworkSpringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(FrameworkSpringbootApplication.class, args);
	}
}
