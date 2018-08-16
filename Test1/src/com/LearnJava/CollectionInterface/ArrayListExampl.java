package com.LearnJava.CollectionInterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import org.w3c.dom.ls.LSException;

public class ArrayListExampl {
	
	public static void main(String[] args) {
		
		List Ls = new ArrayList();
		
		Ls.add("Hello");
		Ls.add("World");
		Ls.add(10.0);
		Ls.add(null);
		Ls.add(20);
		
		System.out.println("*******For Each Loop********");
		for(Object a : Ls) {
			System.out.println(a);
			
		}
		
		
	System.out.println("*******Iterator********");
		
		Iterator I = Ls.iterator();
		while(I.hasNext()) {
			System.out.println(I.next());
		}
		
	System.out.println("*****Enumeration********");
	
	Enumeration E = Collections.enumeration(Ls);
	while(E.hasMoreElements()) {
		System.out.println(E.nextElement());
	}
	}
	
	Ls.forEach((L) -> {
		System.out.println(L + " ");
		
	});

}

