import java.util.Arrays;

public class Stack {
	private int lastItem = 0;
	private int[] items = new int[0];
	
	// add items to the stack
	public void push(int newItem) {
		int index = items.length;	//get current length to store as index
		System.out.println("Array length is: " + index);
		
		items = new int[items.length + 1];	//increase the array 1 so that we can add our new item
		System.out.println("items after extending the length by 1: " + Arrays.toString(items));
		
		items[index] = newItem;	//store the value in the index
		System.out.println("items after storing value: " + Arrays.toString(items));
		
		lastItem = newItem; 	//update
		System.out.println("Last item: " + lastItem);
	}

	// remove items from the stack
	public int pop() {
		int tempItem = lastItem;	//store the last item into a var
		
		//copy new array, but remove last item
		int[] newArray = new int[items.length-1];
		
		for(int i = 0; i<newArray.length;i++) {
			newArray[i] = items[i];
		}
		
		items = newArray;	//update items array
		lastItem = items[items.length-1];	//update lastItem
		
		//return popped element
		return tempItem;
	}

	// view last item
	public int peek() {
		return 0;
	}
}