
public class ConditionalBlocks {
	public static void main(String[] args) {
		/*
		boolean b = false; //change to true to print inside portion
		
		if(b) {
			System.out.println("inside the if-statement");
		} else {
			System.out.println("inside the else-statement");
		}
		System.out.println("outside the if-statement");
		*/
		
		boolean firstCondition = false;
		boolean secondCondition = true;
		
		if(firstCondition) {
			System.out.println("inside if-statement");
			if(secondCondition) {
				System.out.println("inside nested if-statement");
			}
		}else if(secondCondition){
			System.out.println(5);
		}else {
			System.out.println("inside else-statement");
		}
		System.out.println("Outside if-statement");
	}
}
