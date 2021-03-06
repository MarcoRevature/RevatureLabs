package com.example.exceptions;

import java.util.Scanner;

public class Simulation {
	public static void main(String[] args) throws EvenNumberException {
		getInput();
	}
	
	public static void getInput() {
		Scanner in = new Scanner(System.in);
		
		//get input from user
		System.out.println("Type in a number and press Enter...");
		String line = in.nextLine();
		System.out.println("You typed: " + line);
		
		//test number
		if(isEven(line)) {
			try {
				throw new EvenNumberException();
			}catch(EvenNumberException e) {
				e.printStackTrace();
			}finally {
				in.close();
			}
		}
		
		//close scanner
		in.close();
	}
	
	public static boolean isEven(String num) {
		//convert value to a number
		int value = Integer.parseInt(num);
		
		return (value %2 == 0);
	}
}
