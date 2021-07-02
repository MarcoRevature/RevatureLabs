
public class ProductPrinter {
	public static void main(String[] args) {
		int[] arr1 = {2,4,6,8,10,12,14,16,18,20};
        int[] arr2 = {1,2,3,5,7,9,11,13,17,19};
        
        //iterate first set
        for(int i = 0; i < arr1.length; i++) {	//length of arr1 leads to out of bounds
        	//iterate through second set
        	for(int j = 0; j < arr2.length; j++) {
        		//print the product of the elements
        		System.out.println(arr1[i] * arr2[j]);
        	}
        }
	}
}
