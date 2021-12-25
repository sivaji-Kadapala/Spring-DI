package com.looseCoupling;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.looseCoupling.*;

public class Client {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans7.xml");
		System.out.println("Xml file is loaded");
		Student st=context.getBean("stu",Student.class);
		st.cheating();
	}

}
