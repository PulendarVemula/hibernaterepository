package com.createiq.ems.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="EMPLOYEE")
public class Employee {
    @Id
    @Column(name="EMP_ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
	private Integer eid;
    @Column(name="EMP_NAME")
	private String ename;
    @Column(name="EMP_SALARY")
	private Double esalary;
	
	public Employee() {

	}

	public Employee(Integer eid, String ename, Double esalary) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.esalary = esalary;
	}
	

	public Employee(String ename, Double esalary) {
		super();
		this.ename = ename;
		this.esalary = esalary;
	}

	public Integer getEid() {
		return eid;
	}

	public void setEid(Integer eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public Double getEsalary() {
		return esalary;
	}

	public void setEsalary(Double esalary) {
		this.esalary = esalary;
	}
	
	
}
