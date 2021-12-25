package com.obj;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.obj.Student;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Student student = new Student();
//		student.cheating();
		ApplicationContext context = new ClassPathXmlApplicationContext("beans3.xml");
		System.out.println("Xml file is loaded");
//		first object using setter
		Student st=context.getBean("stu",Student.class);
		st.cheating();
	}

}
