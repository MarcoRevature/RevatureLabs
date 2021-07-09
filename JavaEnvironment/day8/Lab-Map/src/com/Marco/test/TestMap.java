package com.Marco.test;

import java.util.HashMap;
import java.util.Set;
import java.util.TreeMap;

public class TestMap {
	public static void main(String[] args) {
		HashMap<String, String> dictionary = new HashMap<>();
		dictionary.put("apple", "A forbidden fruit");
		dictionary.put("banana", "A yellow fruit that can be peeled");
		dictionary.put("cantaloupe", "A melon fruit that has an orange flesh");
		System.out.println(dictionary);
		
		// get value map through key
		String key = "apple";
		String value = dictionary.get(key);
		System.out.println("The value for the key: "+key+" is "+value);
		
		//define TreeMap
		TreeMap<String, String> sortedDictionary = new TreeMap<>();
		sortedDictionary.putAll(dictionary);
		System.out.println(sortedDictionary);
		
		//add element
		sortedDictionary.put("beets", "An actual vegetable");
		System.out.println(sortedDictionary);
		
		//re-add element
		sortedDictionary.put("beets", "A better explamation");
		System.out.println(sortedDictionary);
		
		//create a Set of Keys
		Set<String> keys = sortedDictionary.keySet();
		
		for(String s: keys) {
	          System.out.println("key: " + s);
	        }
	}
}
