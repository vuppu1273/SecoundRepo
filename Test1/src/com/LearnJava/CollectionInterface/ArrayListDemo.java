package com.LearnJava.CollectionInterface;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {
	
	public static void main(String[] args) {
		
		Student std = new Student();
		
		System.out.println("Hello");
		
		ArrayList arrLi = new ArrayList();
		
		System.out.println(arrLi.size());	
		
		
		List L = new ArrayList();
		
		L.add(1);
		L.add("Saikanth");
		L.add("Hyderabad");
		
	/*	
		System.out.println(arrLi.size()); 
		System.out.println(L .size());
		
		System.out.println(L.get(0));
		System.out.println(L.get(1));*/
		
	/*	for(int i= 0 ; i < L.size(); i++) {
			System.out.println(L.get(i));
		}*/
		
		
		for(Object S : L) {
			System.out.println(S);
			
		}
		
		System.out.println("*****");
		Iterator ER = L.iterator();
		while(ER.hasNext()) {
			System.out.println(ER.next());
		}
		
		
		// System.out.println(L.get(7)); Acess index above the size is an exception
		
		/*int x =10; //x is a premmitive data type need to convert in to object to pass into the L.add(). So boxing is done
		 L.add(x); //add expects object as a input Boxing
		 
		Integer y = 20;// y is an object which is an wrapper class variable becomes an object
		 L.add(y)*/;
		
	}

}
