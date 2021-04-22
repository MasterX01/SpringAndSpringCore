package com.example.spring.component;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.example.spring.SpringAndSpringCoreApplication;

@Component
public class EmployeeBean {

	private int empID;
	private String empName;
	
	@Autowired
	private DepartmentBean deptBean;
	public static final Logger logger = LoggerFactory.getLogger(EmployeeBean.class);

	public EmployeeBean() {}
	
	@Autowired
	public EmployeeBean(DepartmentBean deptBean) {
		this.deptBean = deptBean;
	}
	
	public void setEmpID(int empID) {
		this.empID = empID;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getEmpID() {
		return empID;
	}
	public String getEmpName() {
		return empName;
	}
	public DepartmentBean getDeptBean() {
		return deptBean;
	}
	
	@Autowired
	public void setDeptBean(DepartmentBean deptBean) {
		this.deptBean = deptBean;
	}
	
	public void showEmployeeDetails() {
		logger.debug("Employee ID - {}", empID);
		logger.debug("Employee Name - {}", empName);
		deptBean.setDeptName("Computer Science");
		logger.debug("Department - {}", deptBean.getDeptName());
	}
}
