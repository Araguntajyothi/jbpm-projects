package com.elt;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Employee implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	private java.lang.String empId;
	private java.lang.String empName;

	public Employee() {
	}

	public java.lang.String getEmpId() {
		return this.empId;
	}

	public void setEmpId(java.lang.String empId) {
		this.empId = empId;
	}

	public java.lang.String getEmpName() {
		return this.empName;
	}

	public void setEmpName(java.lang.String empName) {
		this.empName = empName;
	}

	public Employee(java.lang.String empId, java.lang.String empName) {
		this.empId = empId;
		this.empName = empName;
	}

}