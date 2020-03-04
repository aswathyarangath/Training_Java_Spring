package com.bean;

public class Customer {
	Person p;


	public Person getP() {
		return p;
	}

	public void setP(Person p) {
		this.p = p;
	}

	@Override
	public String toString() {
		return "Customer [p=" + p + "]";
	}
}
