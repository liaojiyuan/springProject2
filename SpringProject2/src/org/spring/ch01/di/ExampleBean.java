package org.spring.ch01.di;

public class ExampleBean {
	private int id;
	
	public ExampleBean() {
		id=123;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String toString() {
		return "id="+id;
	}
}
