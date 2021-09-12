package com.SeleniumProject.JavaProgrammes;

public class DynamicArrayEg {

	public static void main(String[] args) {
		
		Object[] da = new Object[5];
		
		System.out.println(da.length);
		
		da[0] = "Selenium";
		da[2] = 87000;
		da[0] = 100000;
		
		for (int i = 0; i < da.length; i++) 
		{
			System.out.println(da[i]);			
		}	
	}
}
