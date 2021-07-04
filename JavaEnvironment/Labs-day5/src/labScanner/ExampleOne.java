package labScanner;
import java.util.Scanner;

public class ExampleOne {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please type in a line and hit Enter. ");
		
		String line = scan.nextLine();
		System.out.println("You have typed: " + line);
		
		scan.close();
		
		String numbers = "1 2 3 5 7 9";
		scan = new Scanner(numbers);
		
		while(scan.hasNextInt()) {
			System.out.println(scan.nextInt());
		}
		scan.close();
	}
}
