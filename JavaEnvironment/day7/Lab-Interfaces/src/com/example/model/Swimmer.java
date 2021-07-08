package com.example.model;

public interface Swimmer {
	int FEET_TO_LEAGUE = 18228;
	
	void swim();
	default void dive() {
		System.out.println("Diving...");
	}
	
	static int convertFromFeetToLeagues(int feet) {
		return feet/FEET_TO_LEAGUE;
	}
}
