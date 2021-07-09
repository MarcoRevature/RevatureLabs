package com.Marco.model;

import java.util.ArrayList;
import java.util.Iterator;

public class TestArrayList {
	public static void main(String[] args) {
		ArrayList<Item> items = new ArrayList<Item>();
		items.add(new Item(1, "Item 1"));
		items.add(new Item(2, "Item 2"));
		items.add(new Item(3, "Item 3"));
		items.add(new Item(4, "Item 4"));
		items.add(new Item(5, "Item 5"));
		
		//print 3rd item
		System.out.println(items.get(2));
		
		//remove last item
		Item removed = items.remove(items.size()-1);
		System.out.println(removed);
		
		//iterating over list
		Iterator<Item> iter = items.iterator();
		
		while(iter.hasNext()) {
			Item item = iter.next();
			System.out.println("removing item: "+item);
			iter.remove();
			//iter.remove(); does not work
			//cannot add anything in here
		}
		
		/*
		//generic loop for list
		System.out.println("....printing list....");
		
		for(int i = 0; i < items.size();i++) {
			System.out.println(items.get(i));
			//remove element if you want
			//items.remove(i);
		*/
		
		//confirm the size to 0
		System.out.println(items.size());
	}
}
