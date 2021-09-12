package com.SeleniumProject.JavaProgrammes;

public class InteraceReuseEg extends InterfaceImplementsEg1 {

	public static void main(String[] args) {
		
		InterfaceEg iie = new InterfaceImplementsEg1();
		
		iie.vehicle();
		
		InterfaceEg iie2= new InterfaceImplementsEg2();
		
		iie2.vehicle();
	
	}

}
