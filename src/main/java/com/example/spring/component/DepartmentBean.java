package com.example.spring.component;

import org.springframework.stereotype.Component;

@Component
public class DepartmentBean {

	private String deptName;
	
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	
	public String getDeptName() {
		return deptName;
	}
}
