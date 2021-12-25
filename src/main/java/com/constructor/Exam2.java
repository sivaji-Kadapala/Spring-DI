package com.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//object using constructor
		ApplicationContext context = new ClassPathXmlApplicationContext("beans2.xml");
		Student2 st2=context.getBean("student2",Student2.class);
		st2.displayStudent1();
		
		Student2 st=context.getBean("student",Student2.class);
		st.displayStudent1();
	
	}

}
