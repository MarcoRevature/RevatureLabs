package main;

import java.util.Scanner;

public class Converter {
	public static void main(String[] args) {
		int menuSelection;
		int unit;
		Converter c = new Converter();
		Scanner scan = new Scanner(System.in);
		
		do {
			System.out.println("Please select an option: \n"
					+ "1. Cups to Teaspoons \n"					//1 cup = 48 teaspoons (US, not imperial)
					+ "2. Miles to Kilometers \n"				//1 mile = 1.609344 km
					+ "3. US gallons to Imperial Gallons \n"	//1 gallon (US) = 0.8326716 (Imperial)
					+ "4. Quit");
			
			menuSelection = scan.nextInt();
			System.out.println("Pressed: " + menuSelection);
			switch(menuSelection) {
			default: 
				System.out.println("Quit");
				break;
			case 1:
				System.out.println("Insert how many cups: ");
				unit = scan.nextInt();
				System.out.println(c.cupToTsp(unit) + " teaspoons \n");
				break;
			case 2:
				System.out.println("Insert how many miles: ");
				unit = scan.nextInt();
				System.out.println(c.miToKm(unit) + " kilometers \n");
				break;
			case 3:
				System.out.println("Insert how many gallons(US): ");
				unit = scan.nextInt();
				System.out.println(c.UsToImp(unit) + " gallons(Imperial) \n");
				break;
		}
		}while(menuSelection != 4);
		
		scan.close();
		System.out.println("Good bye");
	}
	
	public double cupToTsp(double temp) {
		final double ctoT = 48.0;
		return temp * ctoT;
	}
	
	public double miToKm(double temp) {
		final double mtoK = 1.609344;
		return temp * mtoK;
	}
	
	public double UsToImp(double temp) {
		final double utoI = 0.8326716;
		return temp * utoI;
	}
	
}
