package labStringMethods;

public class StringMethods {
	public static void main(String[] args) {
		String str = "Hello";
		//System.out.println(str.equals("Hello")); //dot operator. also must be exact match for true
		String s = "Hello";
		System.out.println(str.equals(s));
		
		//length method
		System.out.println(str.length());	//white space is counted
		
		//index method
		System.out.println(str.indexOf("H"));
	}
}
