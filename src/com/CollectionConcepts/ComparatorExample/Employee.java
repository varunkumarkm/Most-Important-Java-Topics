package com.CollectionConcepts.ComparatorExample;

public class Employee {
	
    int empid;
    String name;
    String deptName;

    public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public Employee(int empid, String name, String deptName) {
        this.empid = empid;
        this.name = name;
        this.deptName = deptName;
    }
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", name=" + name + ", deptName=" + deptName + "]";
	}
}


