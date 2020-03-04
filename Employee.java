package com.wire;



public class Employee {
	int salary;
	private Address adr;

	public Employee(){}

	public Employee(Address adr) {
	this.adr = adr;
	}

	public Address getAdr() {
	return adr;
	}

	public void setAdr(Address adr) {
	this.adr = adr;
	}


	public int getSalary() {
	return salary;
	}

	public void setSalary(int salary) {
	this.salary = salary;
	}

	@Override
	public String toString() {
	return "Employee [salary=" + salary + ", adr=" + adr + "]";
	}
}
