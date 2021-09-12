package com.SeleniumProject.JavaProgrammes;

import java.util.Scanner;

public class SwitchCaseEg {

	public static void main(String[] args) {
		
//		String Course = "uft";
		Scanner sc = new Scanner(System.in);
		String Course = sc.next();
		System.out.println("Course value is: "+Course);
		
		switch(Course)
		{
		case "manual":
			System.out.println("You are selected manual");
			break;
		case "Selenium":
			System.out.println("You are selected selenium");
			break;
		case "uft":
			System.out.println("You are selected UFT");
			break;
		default:
			System.out.println("Select a proper course");
			break;
		}
		
	}

}
