package com.SeleniumProject.JavaProgrammes;

public class MethodsEg {

	public String course = "Selenium";
	public static void main(String[] args) 
	{
		function1();
		String res = function2();
		System.out.println(res);
		
		MethodsEg me = new MethodsEg();
		
		me.function3();
		boolean flag = me.function4();
		System.out.println(flag);

	}
	
	// static method without returning any value
	public static void function1(){
		System.out.println("This is function1 code");
	}
	
	// Static method with returning value
	public static String function2(){
		System.out.println("This is function2 code");
		return "Pass";
	}
	
	//Non static method without returning any value
	public void function3(){
		System.out.println("This is function3 code");
	}
	
	// non static method with returning value
	public boolean function4(){
		System.out.println("This is function4 code");
		return true;
	}
	
	public int sum(int a, int b){
		int c = a + b;
		return c;
	}
	
	public int sum(int a, int b, int c){
		int d = a + b+ c;
		return d;
	}
}
