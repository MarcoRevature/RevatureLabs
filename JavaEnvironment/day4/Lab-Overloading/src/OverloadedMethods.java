
public class OverloadedMethods {
	public static void main(String[] args) {
		//create instance here
		OverloadedMethods om = new OverloadedMethods();
		om.print();
		
		om.print("Second Print");
		om.print("third", "fourth");
	}
	
	//overload methods here
	public void print() {
		System.out.println("Original Print Method");
	}
	
	public void print(String s) {
		System.out.println(s);
	}
	
	public void print(String s1, String s2) {
		System.out.println(s1 + " " + s2);
	}
	
	//public void print(String first, String second) {	//this will not work because 
	//	System.out.println(first + " " + second);		//previous has string, string
	//}
}
