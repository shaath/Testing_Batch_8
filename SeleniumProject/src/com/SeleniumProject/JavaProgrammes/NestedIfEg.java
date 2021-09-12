package com.SeleniumProject.JavaProgrammes;

public class NestedIfEg {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 15;
		int c = 1;

		if(a > b & a > c)
		{
			System.out.println("A is greater");
		}
		else if(b > c & b > a)
		{
			System.out.println("B is greater");
		}
		else if( c > a & c > b)
		{
			System.out.println("C is greater");
		}
		else
		{
			System.out.println("Enter valid values for the variables");
		}

	}

}
