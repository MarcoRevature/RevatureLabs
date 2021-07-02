
public class MethodDeclaration {
	public static void main(String[] args) {
		//create a class instance
		MethodDeclaration md = new MethodDeclaration();
		
		//call first method here
		md.talk();
		md.talk();	//can repeat as many times as possible
	}
	
	//create the method here
	public void talk() {
		System.out.println("Inside the talk method");
	}
}
