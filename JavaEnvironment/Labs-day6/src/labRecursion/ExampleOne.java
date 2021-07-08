package labRecursion;
// lab for recursion and Fibonacci had the same project names
public class ExampleOne {
	public static void main(String[] args) {
		//dummy data
		int x = 5;
		
		ExampleOne e = new ExampleOne();
		//methods
		System.out.println(e.factorial(x));
	}
	
	//first method
	public int factorial(int n) {
		if(n <= 0) {return 0;}
		if(n == 1) {return 1;}
		
		return n * factorial(n-1);
	}
}
