package com.fssa.learnJava.coreJava.day05.practice;

class Department {

	String deptName;
	int deptId;

	public Department(String deptName, int deptId) {
		this.deptName = deptName;
		this.deptId = deptId;
	}

	@Override
	public String toString() {
		return "Department [deptName=" + deptName + ", deptId=" + deptId + "]";
	}

}

class Student {

	String name;
	int id;
	Department department;

	public Student(String newName, Department department, int id) {
		this.name = newName;
		this.id = id;
		this.department = department;

	}

	@Override
	public String toString() {
		return "Student [name= " + name + ", id= " + id + ", department= " + department + "]";
	}

}

public class Main {

	public static void main(String[] args) {
		
		Department dept1 = new Department("Bio-tech", 88);
		Student stud1 = new Student("Inba", dept1, 11);
		System.out.println(stud1.toString());

	}

}
