package labConstructors;

public class Constructors {
	public Constructors(int value) {
		System.out.println(value);
	}
	public Constructors() {
		System.out.println("Default Constructors ran");
	}
	public static void main(String[] args) {
		//instances
		Constructors c = new Constructors(5839);
		
		//no arg constructor
		Constructors cNoArg = new Constructors();

	}
}
