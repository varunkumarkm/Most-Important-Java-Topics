package com.CollectionConcepts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class CollectionExample {

	public static void main(String[] args) {
		List arr = new ArrayList<>();
		arr.add(20);
		arr.add(56);
		arr.add("varun");
		arr.add(false);
		arr.add(20);
		arr.add(32.87);
		arr.add(80);
	
		System.out.println(arr);
		System.out.println(arr.contains(20));
		System.out.println(arr.size());
		
		for(var n:arr)
			System.out.println(n);
		
		arr.forEach(n->System.out.println(n));
		
		//USe method referencing: Basically for the shorten form of lambda expression  
		arr.forEach(System.out::println);
		
		//Arrays is a utility class in collection framework
	 List<Integer> numList = new ArrayList<Integer>(Arrays.asList(92,12,34,67,34,11,30,56,89,9));
	 
	    //collection is a interface and Collections is a utility class
	 Collections.sort(numList);
	 numList.forEach(System.out::println);
	 
	    //Check a frequency of values
	 int frequency = Collections.frequency(numList, 34);
	 System.out.println("count = "+ frequency);
	}
}
 class LiskedListExample {
	 public static void main(String[] args) {
		
		 List linked = new LinkedList();
		 linked.add(20);
		 linked.add(56);
		 linked.add(true);
		 linked.add(20);
		 linked.add(45.9);
		 linked.add(20);
		 
		System.out.println(linked);	 
	}
 }
 class SetDemo {
		public static void main(String[] args) {	
			Set<Integer> hashSet = new HashSet<>();
			hashSet.add(10);
			hashSet.add(20);
			hashSet.add(40);
			hashSet.add(10);
			hashSet.add(60);
			hashSet.add(80);
			
		System.out.println(hashSet);
	}
 }
 class LinkedHashSetDemo {
		public static void main(String[] args) {	
			Set<Integer> hashSet = new LinkedHashSet<>();
			hashSet.add(10);
			hashSet.add(90);
			hashSet.add(20);
			hashSet.add(40);
			hashSet.add(10);
			hashSet.add(60);
			hashSet.add(80);
			
		System.out.println(hashSet);
	}
}
 class TreeSetDemo {
		public static void main(String[] args) {	
			Set<Integer> hashSet = new TreeSet<>();
			hashSet.add(10);
			hashSet.add(90);
			hashSet.add(20);
			hashSet.add(40);
			hashSet.add(10);
			hashSet.add(60);
			hashSet.add(80);
			hashSet.add(4);
			
		System.out.println(hashSet);
	}
}
 class MapDemo {
	 public static void main(String[] args) {
		Map<Integer, String> hashMap = new HashMap<>();
		hashMap.put(2, "graps");
		hashMap.put(6, "watermillion");
		hashMap.put(4, "pinapple");
		hashMap.put(3, "mango");
		hashMap.put(12,"banana");
		hashMap.put(9, "orange");
		hashMap.put(11,"cheery");
		
		System.out.println(hashMap);
		System.out.println(hashMap.get(11));
		System.out.println(hashMap.keySet());
		System.out.println(hashMap.values());
		
		hashMap.forEach((key, value)->System.out.println(key + "-" + value));
	}
 }
 
 
 
 
 
 