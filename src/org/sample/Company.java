package org.sample;

public class Company extends Employee {

	@Override
	public void empName() {

		System.out.println("empname is arun");
	}

	@Override
	public void empId() {

		System.out.println("empid is 234");
	}
	public static void main(String[] args) {
		Company s=new Company();
		s.empName();
		s.empId();
		s.empNumber();
	}

}
