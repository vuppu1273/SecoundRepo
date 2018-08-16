package com.LearnJava.CollectionInterface;

import java.util.HashSet;

import java.util.Set;



public class SetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set set = new HashSet();
		
		System.out.println(set.size());
		
		set.add("Hello");
		set.add("World");
		set.add(0.1);
		set.add(20);
		set.add(20);
		set.add(20);
		set.add(20);
		set.add(null);
		set.add(new Employe());
		
		System.out.println("size of set is"+set.size());
		
		for (Object obj : set) {
			System.out.println(obj);
			
		}
		
		
	}

}
