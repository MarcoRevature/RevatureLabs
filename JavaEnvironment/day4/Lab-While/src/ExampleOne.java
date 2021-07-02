
public class ExampleOne {
	public static void main(String[] args) {
		boolean on = true;
		
		while (on){
			System.out.println("inside the while loop");
			on = false;	//need to stop, otherwise infinite loop
		}
	}
}
