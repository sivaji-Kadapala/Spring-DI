package com.obj.Employee;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("beans4.xml");
		System.out.println("Xml is loaded...");
		Employee emp = context.getBean("emp", Employee.class);
		emp.show();

	}

}
