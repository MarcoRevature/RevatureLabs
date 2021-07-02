
public class DisplayingArrays {
	public static void main(String[] args) {
		int[] intArray = new int[3];
		intArray[0] = -5123;
		intArray[1] = 32;
		
		System.out.println(intArray[0]);
		System.out.println(intArray[1]);
		System.out.println(intArray[2]);
		//System.out.println(intArray[3]);	//error, out of bounds
	}
}
