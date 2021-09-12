package com.SeleniumProject.JavaProgrammes;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashsetEg {

	public static void main(String[] args) {
		
		Set<String> hs = new HashSet<>();
		
		hs.add("Selenium");
		hs.add("UFT");
		hs.add("Manual");
		hs.add("Java");
		hs.add("UFT");
		
		
//		System.out.println(hs.size());
//		
//		for (String data : hs) {
//			System.out.println(data);
//		}

		Iterator<String> it = hs.iterator();
		
		while(it.hasNext())
		{
			String data = it.next();
			System.out.println(data);
		}
		
	}

}
