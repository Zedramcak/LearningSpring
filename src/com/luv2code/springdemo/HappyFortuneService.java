package com.luv2code.springdemo;

public class HappyFortuneService implements FortuneService {

	String[] fortunes = {"Today is your lucky day!", "You can do it!", "You are awesome!"};
	
	@Override
	public String getFortune() {
		int random = (int) (Math.random()*3);
		return fortunes[random];
	}

}
