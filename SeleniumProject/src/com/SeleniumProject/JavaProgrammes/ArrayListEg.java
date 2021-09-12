package com.SeleniumProject.JavaProgrammes;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEg {

	public static void main(String[] args) {
		
		List<Object> array_list = new ArrayList<>();
		
		array_list.add("Selenium");
		array_list.add(100000);
		array_list.add(true);
		array_list.add(54.137894);
		array_list.add(2, "UFT");
		array_list.remove(1);
		array_list.set(1, 100000);
		
		System.out.println(array_list.size());
		
//		System.out.println(array_list.get(2));
		for (int i = 0; i < array_list.size(); i++) {
			System.out.println(array_list.get(i));
			
		}

	}

}
