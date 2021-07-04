package labStativVsInstance;

public class Test {
	public static void main(String[] args) {
		A.staticCount = 2494;
		System.out.println("class A staticCount: " + A.staticCount);
		
		A a = new A();
		
		System.out.println(a.instanceCount);
		System.out.println(A.staticCount);	//need to call for A to access static num in static way
		
		A a2 = new A();
		System.out.println(a2.instanceCount);
		System.out.println(A.staticCount);
		
		a.instanceCount = 15;
		
		System.out.println("Object a instanceCount: " + a.instanceCount);
		System.out.println("Object a2 instanceCount: " + a2.instanceCount);
		System.out.println("class A staticCount: " + A.staticCount);
	}
}
