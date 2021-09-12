package com.SeleniumProject.JavaProgrammes;

public class ObjectEg {

	public static void main(String[] args) {
		
		Object[]  x = {100000, "Selenium", 'M', true, 4444.44};
		
		System.out.println(x.length);
		for (int i = 0; i < x.length; i++) 
		{
			System.out.println(x[i]);
		}

	}

}
