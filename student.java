package org.student;

import org.department.department;

public class student extends department{

	public void studentname() {
		System.out.println("Muthuselvi");
	}
	public void studentdept() {
		System.out.println("ECE");
	}
	public void studentid() {
		System.out.println("AC11UEC087");
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
student obj=new student();

obj.collegename();
obj.collegecode();
obj.collegerank();
obj.deptname();
obj.studentname();
obj.studentdept();
obj.studentid();
	}

}
