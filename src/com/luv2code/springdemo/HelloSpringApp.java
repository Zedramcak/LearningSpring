package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Coach theCoach = context.getBean("hockeyCoach", Coach.class);
		
		Coach secondCoach = context.getBean("hockeyCoach", Coach.class);
		
		if (theCoach==secondCoach) {
			System.out.println("I am going crazy!!!");
		}
		else {
			System.out.println("We are twins. But we are both completly different");
		}
		
		System.out.println(theCoach.getDailyWorkout());
		
		System.out.println(theCoach.getDailyFortune());
		
		context.close();

	}

}
