package com.SeleniumProject.JavaProgrammes;

public class InheritanceEg extends MethodsEg{

	public static void main(String[] args) {
		
		function1();
		
		MethodsEg me = new MethodsEg();	
		me.function1();
		
	}
	
	public static void function1(){
		System.out.println("This is Inheritance Eg function1 code");
	}
}
