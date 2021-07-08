package one;

import two.ProtectedSubClass;

public class AccessModifiers {
	public static void main(String[] args) {
		//access methods here
		Person adam = new Person();
		adam.age = 15;	//works until age is made private
		
		System.out.println(adam.age);
		
		ProtectedSubClass psc = new ProtectedSubClass();
		psc.printID();
	}
}
