package com.example.spring;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.spring.component.DemoBean;
import com.example.spring.component.EmployeeBean;

@SpringBootApplication
public class SpringAndSpringCoreApplication {

	public static final Logger logger = LoggerFactory.getLogger(SpringAndSpringCoreApplication.class);
	
	public static void main(String[] args) {
		logger.debug("This is Spring Logger Demo");
		ApplicationContext context = SpringApplication.run(SpringAndSpringCoreApplication.class, args);
		logger.debug("Checking Context: {}", context.getBean(DemoBean.class));
		EmployeeBean empBean = context.getBean(EmployeeBean.class);
		empBean.setEmpID(69);
		empBean.setEmpName("Akash Saxena");
		empBean.showEmployeeDetails();
	}

}
