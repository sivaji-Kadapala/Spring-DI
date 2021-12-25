package com.IOC;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile {
	public static void main(String[] args) {
//	Airtel airtel=new Airtel();
//	airtel.calling();
//	airtel.data();

//	Vodaphone vodaphone=new Vodaphone();
//	vodaphone.calling();
//	vodaphone.data();

//	Sim simV=new Vodaphone();
//	simV.calling();
//   simV.data();

//		Sim simA = new Airtel();
//		simA.calling();
//		simA.data();

//Now App should  be configurable,spring solve this problem
//Framework is create object and control and get the object using that object
		// i.e Inversion of control
		ApplicationContext context = new ClassPathXmlApplicationContext("IOC.xml");
		System.out.println("config loaded:");
//    Using class with type casting
		Airtel air = (Airtel) context.getBean("airtel");
		air.calling();
		air.data();

//		Vodaphone vod = (Vodaphone) context.getBean("vodaphone");
//		vod.calling();
//		vod.data();
//	    Using class without type casting
		Vodaphone voda = context.getBean("vodaphone", Vodaphone.class);
		voda.calling();
		voda.data();
//	    Using interface without type casting
		Sim sim = context.getBean("sim", Sim.class);
		sim.calling();
		sim.data();

		Sim sim1 = context.getBean("sim1", Sim.class);
		sim1.calling();
		sim1.data();
	}
}
