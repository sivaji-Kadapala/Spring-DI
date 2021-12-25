package com.setter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam {
public static void main(String[] args) {
//	This is hard code
//	Student student=new Student();
//	student.setStudentName("sivaji");
//	student.displayStudent();
	ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
	
//	first object using setter
	Student st=context.getBean("student",Student.class);
	st.displayStudent();
//	Second object using setter
	Student st1=context.getBean("student1",Student.class);
	st1.displayStudent();
	
	
	
}
}
