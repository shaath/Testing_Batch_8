package com.SeleniumProject.JavaProgrammes;

public class StaticArrayEg {

	public static void main(String[] args) {
		
		int[] salary = {62000, 76000, 87000, 100000, 200000};
		
		System.out.println(salary.length);
		
//		System.out.println(salary[2]);
		
//		for(int i = 0; i < salary.length ; i++ )
//		{
//			System.out.println(salary[i]);
//		}
		
		for(int data: salary)
		{
			System.out.println(data);
		}
	}

}
