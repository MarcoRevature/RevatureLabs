package labSearchAlgorithms;

public class LinearSearch {
	public static void main(String[] args) {
		//dummy data
		char letter = 'd';
		char[] letters = {'a', 'b', 'c', 'd', 'e', 'f'};	//only did the first few, but whole alphabet can be put here
		
		//call methods
		LinearSearch ls = new LinearSearch();
		System.out.println(ls.findLetter(letter, letters));
	}
	//first method
	public int findLetter(char target, char[] data) {
		if(data == null) return -1;
		int result = -1;
		
		//loop through
		for(int i = 0; i < data.length; i++) {
			char temp = data[i];
			
			if(temp == target) {
				return i;
			}
		}
		
		return result;
	}
}
