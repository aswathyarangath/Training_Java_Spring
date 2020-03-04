package com.bean;

public class Book {
	int id;
	String bname;
	int price;
	public int getId() {
		return id;
	}
	public String getBname() {
		return bname;
	}
	public int getPrice() {
		return price;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", bname=" + bname + ", price=" + price + ", getId()=" + getId() + ", getBname()="
				+ getBname() + ", getPrice()=" + getPrice() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}

}
