
public class ReturnTypes {
	public static void main(String[] args) {
		//create instance
		ReturnTypes rt = new ReturnTypes();
		
		//call method
		rt.returnNothing();
		
		boolean b = rt.returnBoolean();
		
		System.out.println("The value of b is: " + b);
	}
	//create method
	public void returnNothing() {
		System.out.println("Inside void method");
	}
	
	//create bool method
	public boolean returnBoolean() {
		return true;
	}
}
