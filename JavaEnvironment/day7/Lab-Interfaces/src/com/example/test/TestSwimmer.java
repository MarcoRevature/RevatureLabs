package com.example.test;

import com.example.model.Swimmer;
import com.example.model.Whale;

public class TestSwimmer {
	public static void main(String[] args) {
		Swimmer beluga;
		beluga = new Whale();
		beluga.swim();
		beluga.dive();
		
		System.out.println("There are " + Swimmer.FEET_TO_LEAGUE + " in a league");
		
		int feetTraveled = 80000;
		System.out.println("So if the whales went "+feetTraveled+" feet, they "
				+ "would have gone "+Swimmer.convertFromFeetToLeagues(feetTraveled)+ " leagues. ");
	}
}
