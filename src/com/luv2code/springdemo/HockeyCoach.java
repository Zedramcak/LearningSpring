package com.luv2code.springdemo;

public class HockeyCoach implements Coach {

	private FortuneService fortuneService = new HappyFortuneService();
	
	@Override
	public String getDailyWorkout() {
		
		return "Skate around the stadium for 7 minutes and then shoot at the net";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
