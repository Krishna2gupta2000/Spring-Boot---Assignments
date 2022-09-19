package com.topgear.assignment5;

public class EmployeeWithId {

	private int id;
	private Employee employee;
	
	public EmployeeWithId() {
		super();
		// TODO Auto-generated constructor stub
	}
	public EmployeeWithId(int id, Employee employee) {
		super();
		this.id = id;
		this.employee = employee;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	
	
}
