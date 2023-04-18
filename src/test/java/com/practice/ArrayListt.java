package com.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.TreeSet;

public class ArrayListt {

	public static void main(String[] args) {
//		ArrayList<Object> al=new ArrayList<Object>();
//		al.add("man");
//		al.add(null);
//		al.add(10);
//		al.add("hello");
//		al.add(null);
//		al.add(10);
//		ArrayList<Integer> in=new ArrayList<Integer>();
//		in.add(24);
//		in.add(10);
//		in.add(15);
//		in.add(30);
//		in.add(40);
//		Collections.sort(in);
//		System.out.println(in);
//		al.addAll(in);
//		System.out.println(al);
//		if(al.contains("hello"))
//		{
//			System.out.println("is present");
//		}
//		else {
//			System.out.println("not present");
//		}
//		System.out.println(al.get(2));
//		System.out.println(al.size());
//		System.out.println(al.remove(3));
//		System.out.println(al.indexOf("hello"));
//		for(Object value:al)
//		{
//			System.out.println(value);
//		}
//		Iterator<Object> it = al.iterator();
//		while(it.hasNext()) {
//			System.out.println(it.next());
//		}
		
//		System.out.println("priority programe");
//		PriorityQueue<Object> q = new PriorityQueue<Object>();
//		q.add(10);
//		q.add(20);
//		q.add(50);
//		System.out.println(q.peek());
//		System.out.println(q);
//		System.out.println(q.poll());
//		System.out.println(q);
//	
//		System.out.println("hashset programe");
//		HashSet<Object> set = new HashSet<Object>();
//		set.add(10);
//		set.add("hi");
//		set.add("hello");
//		set.add(null);
//		set.add(10);
//		set.add(null);
//		System.out.println(set);
//		ArrayList<Object> list = new ArrayList<Object>(set);
//		list.add(20);
//		list.add("bye");
//		System.out.println(list);
//		System.out.println(set.size());
//		System.out.println(list.size());
//		
//		LinkedHashSet<Object> set1 = new LinkedHashSet<Object>();
//		set1.add(10);
//		set1.add("hi");
//		set1.add("hello");
//		set1.add(null);
//		set1.add(10);
//		set1.add(null);
//		System.out.println(set1);
//		ArrayList<Object> list1 = new ArrayList<Object>(set1);
//		list1.add(20);
//		list1.add("bye");
//		System.out.println(list1);
//		System.out.println(set1.size());
//		System.out.println(list1.size());
//		System.out.println(list1.get(2));
//		System.out.println(list1.remove(2));
//		System.out.println(list1.indexOf("hello"));
		
		
		TreeSet<Object> set2 = new TreeSet<Object>();
		set2.add(30);
		set2.add(10);
		set2.add(20);
		set2.add(60);
		//set2.add("hi");hetrogenious objects are not allowed if u try to enter means it get[ClassCastException]
		//set2.add(null);  null values are not allowed if u try to enter null values it get [NullPointerException]
		System.out.println(set2);
		System.out.println(set2.descendingSet());
		
//	  Hashtable<Integer, String> map = new Hashtable<Integer, String>();	
//	  map.put(20, "hi");
//	  map.put(40, "hello");
//	 // map.put(null, "hi");
//	// map.put(60, null);
//	  map.put(70, "bye");
//	  map.put(70, "hihello");
//	  map.put(50, "hi");
//	  System.out.println(map);
//		for(Entry<Integer, String> m:map.entrySet()) {
//			System.out.println(m.getKey()+"   "+m.getValue());
//			
//		}
//		System.out.println(map.contains("hello"));
//		System.out.println(map.containsKey(50));
//		map.remove(70);
//		map.remove(70, "hihello");
//		System.out.println(map.get(50));
//		System.out.println(map);
		
		
//		HashMap<Integer, Object> map = new HashMap<Integer, Object>();
//		 map.put(20, "hi");
//		  map.put(40, "hello");
//		  map.put(null, "hi");
//		  map.put(null, null);
//		  map.put(60, null);
//		  map.put(80, null);
//		  map.put(70, "bye");
//		  map.put(70, "hihello");
//		  map.put(50, "hi");
//		  System.out.println(map);
//			for(Entry<Integer, Object> m:map.entrySet()) {
//				System.out.println(m.getKey()+"   "+m.getValue());
//				
//			}
//		    System.out.println(map.containsKey(50));
//			map.remove(70);
//			map.remove(70, "hihello");
//			System.out.println(map.get(50));
//			System.out.println(map);
			
			
//		LinkedHashMap<Integer, Object> map = new LinkedHashMap<Integer, Object>();
//		 map.put(20, "hi");
//		  map.put(40, "hello");
//		  map.put(null, "hi");
//		  map.put(null, null);
//		  map.put(60, null);
//		  map.put(80, null);
//		  map.put(70, "bye");
//		  map.put(70, "hihello");
//		  map.put(50, "hi");
//		  System.out.println(map);
//			
			
			
	}

}
