package com.setter;

public class Student {
	//Setter injection
	private int id;
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
		System.out.println("setter method called:"+"setId");
	}

	private String StudentName;

	public String getStudentName() {
		return StudentName;
	}

	public void setStudentName(String studentName) {
		StudentName = studentName;
		System.out.println("setter method called:"+"setStudentName");
	}
	public void displayStudent() {
		System.out.println("Student name is:"+StudentName+",id is:"+id);
	}
	
	
	
	
	
}
