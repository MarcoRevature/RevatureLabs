package setUp;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		Group g = new Group();
		fillGroup(g);
		
		Event e1 = new Event("Home Tour", 100);
		
	}
	
	public static void fillGroup() {
		Member p1 = new Member("Chase", 79);
		Member p2 = new Member("Robert", 83);
		Member p3 = new Member("Sam", 69);
		Member p4 = new Member("Pete", 90);
	}
	
	public static void fillEvents(){
		Event e1 = new Event("Home Tour", 79);
		Event e2 = new Event("Home Tour", 83);
		Event e3 = new Event("Home Tour", 69);
		Event e4 = new Event("Home Tour", 90);
	}
}
