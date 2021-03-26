package com.springDemo.auto.wire;

public class Employee {
	private Address addr;

	public Address getAddr() {
		return addr;
	}

	public void setAddr(Address addr) {
		this.addr = addr;
	}

	public Employee(Address addr) {
		super();
		this.addr = addr;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "Employee [addr=" + addr + "]";
	}
}
