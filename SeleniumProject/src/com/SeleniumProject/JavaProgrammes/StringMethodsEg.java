package com.SeleniumProject.JavaProgrammes;

public class StringMethodsEg {

	public static void main(String[] args) {
		
		String course = "  Selenium  ";
		int salary = 10000;
		
//		System.out.println(course.length());
//		
//		System.out.println(course.charAt(2));
//		
//		System.out.println(course.indexOf('l'));
//		
//		System.out.println(course.toUpperCase());
//		
//		System.out.println(course.toLowerCase());
//		
//		System.out.println(course.substring(2, 5));
		
//		System.out.println(course.substring(2, 8));
//		System.out.println(course.substring(2));
		
//		System.out.println(course.startsWith("Sel"));
//		
//		System.out.println(course.endsWith("ium"));
//		
//		System.out.println(course.contains("len"));
//		
//		System.out.println(course.equalsIgnoreCase("selenium"));
		
//		String x = course.trim();
//		
//		System.out.println(x);
//		
//		System.out.println(x.length());
		
//		System.out.println(course + " is a functional automation testing tool");
		
//		System.out.println(course.concat(" is a course"));
		
//		System.out.println(course.join(" ", course, "is", "a", "course"));
		
//		System.out.println(course.isEmpty());
		
//		System.out.println(course.lastIndexOf('e'));
		
//		System.out.println(course.replace('e', 'x'));
		
//		System.out.println(course.getClass().getSimpleName());
		
//		System.out.println(((Object)salary).getClass().getSimpleName());
		
		String x = "I am learning Java";
		String[] y = x.split(" ");
		
		System.out.println(y.length);
		
		for (int i = 0; i < y.length; i++) {
			System.out.println(y[i]);
		}
		
	}

}
