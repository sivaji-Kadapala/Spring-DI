package com.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("beans5.xml");
		System.out.println("Xml is loaded...");
		Question question = context.getBean("question", Question.class);
		question.displayInfo();

	}

}
